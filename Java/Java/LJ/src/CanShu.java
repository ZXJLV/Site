import java.util.Scanner;

//有参，无参，返回值

public class CanShu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CanShu canShu = new CanShu();

        canShu.OpenWaterTop();

        canShu.DrinkWater("铁观音");

        canShu.LookTV("CCTV-14", "1280*720");

        System.out.println("请输入你的用户名和密码：");
        System.out.println(canShu.Oline(input.next(), input.nextInt()));


    }
    //开瓶盖  无参
    public void OpenWaterTop(){
        System.out.println("开瓶盖");
    }

    //喝水  有参
    public void DrinkWater(String name){
        System.out.println("喝" + name);
    }

    //看电视  有俩参
    public void LookTV(String what,String px){
        System.out.println("看:" + what + "\t分辨率:" + px);
    }

    //登录  返回值
    public String Oline(String userName,int password){

        String yesNo = null;

        if ( "User".equals(userName) && password == 123456){
            yesNo = "登录成功";
        }else {
            yesNo = "登录失败";
        }

        return yesNo;
    }





}
