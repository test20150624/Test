package tt;
import java.awt.*;
import java.applet.*;
public class test1 extends Applet
{



	/**
	 * @param args
	 */
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2222222222222");


	}*/
	  String name,tas,height,class1;
	    int age=0;
	    public void ff(String a){
	    	tas=a;
	    }
	public void init(){
   name=getParameter("name");
   tas=getParameter("tas");
   height=getParameter("height");
   class1=getParameter("class");
     /*   String a=getParameter("age");
        age=Integer.parseInt(a);*/
    }
    public void paint(Graphics g){
    g.drawString("Hello", 10, 10);
    g.drawString("Welcome to Applet Programming!",30,30);
    System.out.println(name+"*********");
    g.drawString(    name+"*********",60,60);
    g.drawString(    tas+"*********",80,80);
    g.drawString(    height+"*********",180,180);
    g.drawString(    class1+"*********",280,280);
    }
}
