package u0;

import android.view.MotionEvent;

/* renamed from: u0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2085o extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2086p f24791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2085o(C2086p c2086p, int i7) {
        super(1);
        this.f24790a = i7;
        this.f24791b = c2086p;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f24790a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                Y0.d dVar = this.f24791b.f24792a;
                if (dVar != null) {
                    dVar.invoke(motionEvent);
                    return Db.q.f3365a;
                }
                kotlin.jvm.internal.l.j("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                Y0.d dVar2 = this.f24791b.f24792a;
                if (dVar2 != null) {
                    dVar2.invoke(motionEvent2);
                    return Db.q.f3365a;
                }
                kotlin.jvm.internal.l.j("onTouchEvent");
                throw null;
        }
    }
}
