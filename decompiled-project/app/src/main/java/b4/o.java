package b4;

import A9.O0;
import java.util.Set;

/* loaded from: classes.dex */
public final class o implements Y3.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f13873a;

    /* renamed from: b, reason: collision with root package name */
    public final C0838i f13874b;

    /* renamed from: c, reason: collision with root package name */
    public final p f13875c;

    public o(Set set, C0838i c0838i, p pVar) {
        this.f13873a = set;
        this.f13874b = c0838i;
        this.f13875c = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [A9.O0, java.lang.Object] */
    public final O0 a(String str, Y3.c cVar, Y3.e eVar) {
        Set set = this.f13873a;
        if (!set.contains(cVar)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
        }
        C0838i c0838i = this.f13874b;
        p pVar = this.f13875c;
        ?? obj = new Object();
        obj.f922a = c0838i;
        obj.f923b = str;
        obj.f924c = cVar;
        obj.f925d = eVar;
        obj.f926e = pVar;
        return obj;
    }
}
