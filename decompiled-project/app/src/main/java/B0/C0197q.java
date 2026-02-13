package B0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import y1.C2354b;

/* renamed from: B0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197q extends C2354b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f1948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0.L f1949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f1950f;

    public C0197q(D d10, A0.L l10, D d11) {
        this.f1948d = d10;
        this.f1949e = l10;
        this.f1950f = d11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().a().g) goto L19;
     */
    @Override // y1.C2354b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view, z1.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f26680a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f28173a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        D d10 = this.f1948d;
        L l10 = d10.f1582D;
        if (l10.u()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        A0.L l11 = this.f1949e;
        A0.L t5 = l11.t();
        while (true) {
            if (t5 == null) {
                t5 = null;
                break;
            } else if (t5.f60S.d(8)) {
                break;
            } else {
                t5 = t5.t();
            }
        }
        Integer valueOf = t5 != null ? Integer.valueOf(t5.f70b) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        D d11 = this.f1950f;
        eVar.f28174b = intValue;
        accessibilityNodeInfo.setParent(d11, intValue);
        int i7 = l11.f70b;
        int d12 = l10.f1718E.d(i7);
        if (d12 != -1) {
            Y0.j o10 = X.o(d10.getAndroidViewsHandler$ui_release(), d12);
            if (o10 != null) {
                accessibilityNodeInfo.setTraversalBefore(o10);
            } else {
                accessibilityNodeInfo.setTraversalBefore(d11, d12);
            }
            D.b(d10, i7, accessibilityNodeInfo, l10.f1720G);
        }
        int d13 = l10.f1719F.d(i7);
        if (d13 != -1) {
            Y0.j o11 = X.o(d10.getAndroidViewsHandler$ui_release(), d13);
            if (o11 != null) {
                accessibilityNodeInfo.setTraversalAfter(o11);
            } else {
                accessibilityNodeInfo.setTraversalAfter(d11, d13);
            }
            D.b(d10, i7, accessibilityNodeInfo, l10.f1721H);
        }
    }
}
