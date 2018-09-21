package remd.test4;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

// 직렬화를 통해 저장가능
public class Notice implements Serializable {
	
	// 전역변수
	private int no;
	private String title;
	private Date date;
	private String writer;
	private String content;
	
	// 생성자
	public Notice(){}
	public Notice(int no,String title,Date date,String writer,String content){
		this.no=no;
		this.title=title;
		this.date=date;
		this.writer=writer;
		this.content=content;
	}
	
	// 출력
	@Override
	public String toString(){
		return no+" "+title+"\t"+new SimpleDateFormat("yyyy-MM-dd").format(date)+" "+writer+"\t"+content;
	}
	
	// 세터 & 게터
	public void setNo(int no){
		this.no=no;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setDate(Date date){
		this.date=date;
	}
	public void setWriter(String writer){
		this.writer=writer;
	}
	public void setContent(String content){
		this.content=content;
	}
	public int getNo(){
		return no;
	}
	public String getTitle(){
		return title;
	}
	public Date getDate(){
		return date;
	}
	public String getWriter(){
		return writer;
	}
	public String getContent(){
		return content;
	}
}
