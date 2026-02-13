package Y0;

import A0.v0;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(q qVar, int i7) {
        super(0);
        this.f11091a = i7;
        this.f11092b = qVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        v0 snapshotObserver;
        switch (this.f11091a) {
            case 0:
                this.f11092b.getLayoutNode().A();
                return Db.q.f3365a;
            case 1:
                q qVar = this.f11092b;
                if (qVar.f11109e && qVar.isAttachedToWindow() && qVar.getView().getParent() == qVar) {
                    snapshotObserver = qVar.getSnapshotObserver();
                    snapshotObserver.a(qVar, b.f11068b, qVar.getUpdate());
                }
                return Db.q.f3365a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f11092b.f11138N.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                q qVar2 = this.f11092b;
                qVar2.getReleaseBlock().invoke(qVar2.f11138N);
                q.o(qVar2);
                return Db.q.f3365a;
            case 4:
                q qVar3 = this.f11092b;
                qVar3.getResetBlock().invoke(qVar3.f11138N);
                return Db.q.f3365a;
            default:
                q qVar4 = this.f11092b;
                qVar4.getUpdateBlock().invoke(qVar4.f11138N);
                return Db.q.f3365a;
        }
    }
}
