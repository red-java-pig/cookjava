package psn.redpig.tij4.exercise.initialization;

import static net.mindview.util.Print.*;

public class Ex1 {
    private String s1;

    public Ex1() {
        //如果String类型数据成员自动初始化为null，则打印：s1 is null
        if(s1 == null) 
            print("s1 is null");
    }
	public static void main(String[] args) {
		new Ex1();
	}
}