import javax.swing.*; // GUI 컴포넌트(버튼, 창, 텍스트필드 등)
import java.awt.*; // 그래픽 처리, 레이아웃, 이벤트 처리에 필요한 기본 GUI 요소
import java.awt.event.*; // 이벤트 처리 (버튼 클릭, 키보드 입력, 마우스 움직임 등)
import java.io.File; // 파일이나 디렉터리를 나타내는 클래스
import java.io.FileReader; // 파일로부터 문자 단위로 데이터를 읽을 때 사용하는 클래스
import java.security.PublicKey; // 암호화 관련 클래스, 공개 키(public key)

import javax.swing.table.*; // 테이블 관련 컴포넌트와 클래스
public class 데이터관리 extends JFrame implements ActionListener{

	JTextField tf;
	JButton btn;
	JTable table; //모양
	DefaultTableModel model; // 데이터 입출력
	JComboBox box=new JComboBox();
	
	// 데이터 읽기
	String[] mnos=new String[1938];
	String[] titles=new String[1938];
	String[] posters=new String[1938];
	String[] actors=new String[1938];
	String[] genres=new String[1938];
	String[] grades=new String[1938];
	TableColumn column;
	
	// 초기화
	public 데이터관리()
	{
		// 값을 채운다
		try
		{
			String movie="";
			File file=new File("c:\\javaDev\\movie.txt");
			int i=0; // 파일 읽어서 저장하는 변수
			// 한 글자 읽기 => 정수로 읽는다 'A' => 65
			FileReader fr=new FileReader(file);
			StringBuffer sd=new StringBuffer();
			while ((i=fr.read())!=-1)
			{
				// -1 : EOF
				sd.append((char)i);
			}
			fr.close();
			movie=sd.toString();
			
			i=0;
			String[] movies=movie.split("\n");
			for(String m:movies)
			{
//				System.out.println(m);
				String[] info=m.split("\\|"); 
//				| => 정규식에서 "또는" (OR) 으로 동작
//				\\| => 실제 | 출력 => 
				
				mnos[i]=info[0];
				titles[i]=info[1];
				genres[i]=info[2];
				posters[i]=info[3];
				actors[i]=info[4];
				grades[i]=info[6];
				i++;
			}
		}catch(Exception ex){}
		
		box.addItem("제목");
		box.addItem("출연");
		box.addItem("장르");
		box.setBounds(10, 15, 130, 35);
		add(box);
		
		tf=new JTextField();
		btn=new JButton("검색");
		setLayout(null);
		tf.setBounds(145, 15, 250, 35);
		btn.setBounds(400, 15, 100, 35);
		
		// 윈도우에 추가
		add(tf);add(btn);
		
		// 테이블
		String[] col= {"번호","영화명","출연진","장르","등급"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row,col)
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 60, 760, 500);
		add(js);
		
		for(int i=0;i<col.length;i++)
		{
			column=table.getColumnModel().getColumn(i);
			if(i==0)
				column.setPreferredWidth(30);
			else if(i==1)
				column.setPreferredWidth(150);
			else if(i==2)
				column.setPreferredWidth(200);
			else if(i==3)
				column.setPreferredWidth(150);
			else if(i==4)
				column.setPreferredWidth(40);
		}
		
		for(int i=0;i<titles.length;i++)
		{
			String[] datas= {
					mnos[i],
					titles[i],
					actors[i],
					genres[i],
					grades[i]
			};
			model.addRow(datas);
		}
		setSize(800, 600);
		setVisible(true);
		
		setSize(800, 600);
		setVisible(true);
		btn.addActionListener(this);
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex) {}
		new 데이터관리();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn||e.getSource()==tf) // btn 버튼 클릭 시
		{
			String cate=(String)box.getSelectedItem();
//			System.out.println(cate);
			
			// 입력값 읽기
			String fd=tf.getText();
			if(fd.length()<1) // 입력이 없다면
			{
				JOptionPane.showConfirmDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			
			// 검색
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);
			}
			
			if(cate.equals("제목"))
			{
				for(int i=0;i<titles.length;i++)
				{
					if(titles[i].contains(fd))
					{
						String[] datas= {
								mnos[i],
								titles[i],
								actors[i],
								genres[i],
								grades[i]
						};
						model.addRow(datas);
					}
					
				}
			}
			else if(cate.equals("출연"))
			{
				for(int i=0;i<actors.length;i++)
				{
					if(actors[i].contains(fd))
					{
						String[] datas= {
								mnos[i],
								titles[i],
								actors[i],
								genres[i],
								grades[i]
						};
						model.addRow(datas);
					}
					
				}
			}
			else if(cate.equals("장르"))
			{
				for(int i=0;i<genres.length;i++)
				{
					if(genres[i].contains(fd))
					{
						String[] datas= {
								mnos[i],
								titles[i],
								actors[i],
								genres[i],
								grades[i]
						};
						model.addRow(datas);
					}
					
				}
			}
		}
	}
}

