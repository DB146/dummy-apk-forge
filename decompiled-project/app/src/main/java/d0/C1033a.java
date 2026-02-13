package d0;

import Db.q;
import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.m;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033a extends m implements Rb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1034b f16298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1033a(C1034b c1034b, int i7) {
        super(4);
        this.f16298a = c1034b;
        this.f16299b = i7;
    }

    @Override // Rb.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        C1034b c1034b = this.f16298a;
        R7.a aVar = c1034b.f16300a;
        Rect rect = new Rect(intValue, intValue2, intValue3, intValue4);
        ((AutofillManager) aVar.f8927b).notifyViewEntered(c1034b.f16302c, this.f16299b, rect);
        return q.f3365a;
    }
}
