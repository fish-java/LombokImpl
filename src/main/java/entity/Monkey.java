package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter // 为所有属性生成公有的getter setter方法
@NoArgsConstructor // 生成公有无参构造函数
@AllArgsConstructor // 生成全参构造函数
public class Monkey {
    public String name;
    protected Integer id;
    private Date birthday;
}
