package Yb;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface b extends a {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    i getReturnType();

    List getTypeParameters();

    j getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
