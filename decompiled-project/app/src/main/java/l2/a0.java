package l2;

/* loaded from: classes.dex */
public interface a0 {
    default Y a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default Y b(Class cls, o2.d dVar) {
        return a(cls);
    }

    default Y c(kotlin.jvm.internal.e eVar, o2.d dVar) {
        return b(c2.i.q(eVar), dVar);
    }
}
