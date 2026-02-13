package y9;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.kt.apps.core.utils.AnimationUtilsKt;
import java.util.Collection;
import java.util.List;
import m4.C1549C;
import m4.C1558a0;
import m4.C1562c0;

/* renamed from: y9.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2470m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27519b;

    public /* synthetic */ C2470m(AbstractC2456A abstractC2456A, int i7) {
        this.f27518a = i7;
        this.f27519b = abstractC2456A;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        ImageView imageView;
        C1558a0 k;
        C1562c0 c1562c0;
        C1558a0 k7;
        View view;
        boolean z8 = true;
        Db.q qVar = Db.q.f3365a;
        AbstractC2456A abstractC2456A = this.f27519b;
        I i7 = (I) obj;
        switch (this.f27518a) {
            case 0:
                Db.o oVar = AbstractC2456A.g2;
                if ((i7 instanceof G) && (imageView = abstractC2456A.f27438H1) != null) {
                    Iterable<W9.j> iterable = (Iterable) ((G) i7).f27483a;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        for (W9.j jVar : iterable) {
                            String str = jVar.f10894a;
                            C1549C c1549c = abstractC2456A.H0().f3807c;
                            CharSequence charSequence = null;
                            if (kotlin.jvm.internal.l.a(str, (c1549c == null || (k7 = c1549c.k()) == null) ? null : k7.f20223a)) {
                                C1549C c1549c2 = abstractC2456A.H0().f3807c;
                                if (c1549c2 != null && (k = c1549c2.k()) != null && (c1562c0 = k.f20226d) != null) {
                                    charSequence = c1562c0.f20319a;
                                }
                                if (kotlin.jvm.internal.l.a(jVar.f10896c, charSequence)) {
                                    imageView.setSelected(z8);
                                }
                            }
                        }
                    }
                    z8 = false;
                    imageView.setSelected(z8);
                }
                return qVar;
            case 1:
                Db.o oVar2 = AbstractC2456A.g2;
                if (i7 instanceof G) {
                    Toast.makeText(abstractC2456A.i0(), "Đã thêm vào danh sách yêu thích", 0).show();
                } else if (i7 instanceof D) {
                    Toast.makeText(abstractC2456A.i0(), "Thêm vào danh sách yêu thích thất bại", 0).show();
                }
                return qVar;
            case 2:
                Db.o oVar3 = AbstractC2456A.g2;
                if (i7 instanceof G) {
                    Toast.makeText(abstractC2456A.i0(), "Đã xóa khỏi danh sách yêu thích", 0).show();
                } else if (i7 instanceof D) {
                    Toast.makeText(abstractC2456A.i0(), "Xóa khỏi danh sách yêu thích thất bại", 0).show();
                }
                return qVar;
            default:
                Db.o oVar4 = AbstractC2456A.g2;
                if (i7 instanceof G) {
                    G g = (G) i7;
                    if (((Collection) g.f27483a).isEmpty() || ((List) g.f27483a).size() <= 1) {
                        View view2 = abstractC2456A.f27473r1;
                        if (view2 != null) {
                            AnimationUtilsKt.gone(view2);
                        }
                    } else {
                        View view3 = abstractC2456A.f27473r1;
                        if (view3 != null) {
                            AnimationUtilsKt.visible(view3);
                        }
                    }
                } else if (i7 instanceof D) {
                    Throwable th = ((D) i7).f27482a;
                    if ((th instanceof L9.c) && ((L9.c) th).f6424a == 4404 && (view = abstractC2456A.f27473r1) != null) {
                        AnimationUtilsKt.gone(view);
                    }
                }
                return qVar;
        }
    }
}
