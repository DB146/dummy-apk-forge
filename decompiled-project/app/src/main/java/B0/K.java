package B0;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f1711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(L l10, int i7) {
        super(1);
        this.f1710a = i7;
        this.f1711b = l10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f1710a) {
            case 0:
                L l10 = this.f1711b;
                return Boolean.valueOf(l10.f1728d.getParent().requestSendAccessibilityEvent(l10.f1728d, (AccessibilityEvent) obj));
            default:
                V0 v02 = (V0) obj;
                L l11 = this.f1711b;
                l11.getClass();
                if (v02.f1799b.contains(v02)) {
                    l11.f1728d.getSnapshotObserver().a(v02, l11.f1727O, new A0.K(6, v02, l11));
                }
                return Db.q.f3365a;
        }
    }
}
