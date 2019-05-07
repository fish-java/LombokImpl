package util;

// Java中没有自动类型推断的语法
//   如果你想要这个语法糖的话，可以使用val，类似于JS的var
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import entity.Monkey;
import lombok.val;

import java.util.ArrayList;

public class Val {
    public static void val(){
        val a = "ds";

        // 自动推断出b的类型
        val b = new ArrayList<String>();
    }
}
