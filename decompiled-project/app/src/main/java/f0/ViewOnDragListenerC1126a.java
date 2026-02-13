package f0;

import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import A0.C0005a;
import A0.D0;
import P4.C0463k;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import c0.l;
import f0.ViewOnDragListenerC1126a;
import u.C2048a;
import u.C2053f;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC1126a implements View.OnDragListener, c {

    /* renamed from: a, reason: collision with root package name */
    public final f f16922a;

    /* renamed from: b, reason: collision with root package name */
    public final C2053f f16923b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f16924c;

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, f0.f] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public ViewOnDragListenerC1126a() {
        ?? lVar = new l();
        lVar.f16933E = 0L;
        this.f16922a = lVar;
        this.f16923b = new C2053f(0);
        this.f16924c = new AbstractC0012d0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            @Override // A0.AbstractC0012d0
            public final l d() {
                return ViewOnDragListenerC1126a.this.f16922a;
            }

            @Override // A0.AbstractC0012d0
            public final /* bridge */ /* synthetic */ void e(l lVar2) {
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return ViewOnDragListenerC1126a.this.f16922a.hashCode();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C0463k c0463k = new C0463k(dragEvent, 23);
        int action = dragEvent.getAction();
        f fVar = this.f16922a;
        C2053f c2053f = this.f16923b;
        switch (action) {
            case 1:
                ?? obj = new Object();
                e eVar = new e(c0463k, fVar, obj);
                if (eVar.invoke(fVar) == D0.f16a) {
                    AbstractC0017g.x(fVar, eVar);
                }
                boolean z8 = obj.f19130a;
                c2053f.getClass();
                C2048a c2048a = new C2048a(c2053f);
                while (c2048a.hasNext()) {
                    ((f) c2048a.next()).t0(c0463k);
                }
                return z8;
            case 2:
                fVar.s0(c0463k);
                return false;
            case 3:
                return fVar.p0(c0463k);
            case 4:
                C0005a c0005a = new C0005a(c0463k, 23);
                if (c0005a.invoke(fVar) == D0.f16a) {
                    AbstractC0017g.x(fVar, c0005a);
                }
                c2053f.clear();
                return false;
            case 5:
                fVar.q0(c0463k);
                return false;
            case 6:
                fVar.r0(c0463k);
                return false;
            default:
                return false;
        }
    }
}
