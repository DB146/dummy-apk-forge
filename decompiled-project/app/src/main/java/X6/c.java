package X6;

import E5.o;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f10998a;

    public c(o oVar) {
        this.f10998a = oVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        o oVar = this.f10998a;
        try {
            Mac mac = (Mac) a.f10995f.a((String) oVar.f3714c);
            mac.init((SecretKeySpec) oVar.f3715d);
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
