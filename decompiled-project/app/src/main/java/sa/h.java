package sa;

import A9.AbstractC0113m2;
import A9.AbstractC0117n2;
import Db.o;
import W1.G;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.l;
import java.util.Map;
import ma.C1651b;

/* loaded from: classes2.dex */
public final class h extends AbstractC0117n2 {

    /* renamed from: a, reason: collision with root package name */
    public final o f24229a = android.support.v4.media.session.b.z(new l(18));

    /* renamed from: b, reason: collision with root package name */
    public Float f24230b;

    public h(G g) {
    }

    @Override // A9.AbstractC0117n2
    public final AbstractC0113m2 a(Object obj) {
        AbstractC0113m2 abstractC0113m2;
        if (obj == null) {
            throw new IllegalStateException("Null item");
        }
        o oVar = this.f24229a;
        AbstractC0113m2 abstractC0113m22 = (AbstractC0113m2) ((Map) oVar.getValue()).get(obj.getClass().getName());
        AbstractC0113m2 abstractC0113m23 = abstractC0113m22;
        if (abstractC0113m22 == null) {
            if ((obj instanceof TVChannel) || (obj instanceof ExtensionsChannel)) {
                e eVar = new e();
                Float f4 = this.f24230b;
                abstractC0113m2 = eVar;
                if (f4 != null) {
                    eVar.f24223d = f4.floatValue();
                    abstractC0113m2 = eVar;
                }
            } else if (obj instanceof C1651b) {
                abstractC0113m2 = new f(true);
            } else {
                if (!(obj instanceof Jc.a)) {
                    throw new IllegalStateException("Not support presenter for: ".concat(obj.getClass().getName()));
                }
                c cVar = new c();
                Float f10 = this.f24230b;
                abstractC0113m2 = cVar;
                if (f10 != null) {
                    cVar.f24218e = f10.floatValue();
                    abstractC0113m2 = cVar;
                }
            }
            ((Map) oVar.getValue()).put(obj.getClass().getName(), abstractC0113m2);
            abstractC0113m23 = abstractC0113m2;
        }
        return abstractC0113m23;
    }
}
