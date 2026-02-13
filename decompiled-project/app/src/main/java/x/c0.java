package x;

/* loaded from: classes.dex */
public interface c0 {
    Object a();

    default boolean b(w.x xVar, w.x xVar2) {
        return xVar.equals(a()) && xVar2.equals(c());
    }

    Object c();
}
