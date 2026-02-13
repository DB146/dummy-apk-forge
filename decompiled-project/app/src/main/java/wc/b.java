package wc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.function.Function;
import xc.q;
import xc.x;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25869a;

    public /* synthetic */ b(int i7) {
        this.f25869a = i7;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f25869a) {
            case 0:
                return new ArrayList();
            case 1:
                return new IdentityHashMap();
            case 2:
                k kVar = (k) obj;
                String l10 = l.l(kVar.f25888a);
                kVar.f25888a = null;
                return l10;
            case 3:
                return Collections.unmodifiableList((List) obj);
            case 4:
                q qVar = (q) obj;
                return qVar instanceof x ? ((x) qVar).Z() : qVar.K("br") ? "\n" : "";
            case 5:
                return new HashMap();
            case 6:
                return ((xc.l) obj).o0();
            default:
                return ((q) obj).Q();
        }
    }
}
