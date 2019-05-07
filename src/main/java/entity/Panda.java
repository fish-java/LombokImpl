package entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString // 生成toString方法
public class Panda {
    // 为单一属性生成protect的getter方法
    @Getter(value = AccessLevel.PROTECTED)
    @Setter(AccessLevel.PUBLIC)
    private String name;
}
