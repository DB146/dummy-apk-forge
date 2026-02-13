package p0;

import android.graphics.PathMeasure;
import j0.C1369g;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: b, reason: collision with root package name */
    public static final e f22993b = new e(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f22994c = new e(0, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i10) {
        super(i7);
        this.f22995a = i10;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f22995a) {
            case 0:
                return new C1369g(new PathMeasure());
            default:
                return Db.q.f3365a;
        }
    }
}
