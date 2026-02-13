package c0;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public static final f f14105a = new kotlin.jvm.internal.m(2);

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        k kVar = (k) obj2;
        if (str.length() == 0) {
            return kVar.toString();
        }
        return str + ", " + kVar;
    }
}
