package G0;

import Db.q;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import cc.E;
import j0.AbstractC1362A;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class b extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f4241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f4243c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rect f4244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Consumer f4245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, Hb.d dVar) {
        super(2, dVar);
        this.f4242b = fVar;
        this.f4243c = scrollCaptureSession;
        this.f4244d = rect;
        this.f4245e = consumer;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new b(this.f4242b, this.f4243c, this.f4244d, this.f4245e, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f4241a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            ScrollCaptureSession scrollCaptureSession = this.f4243c;
            Rect rect = this.f4244d;
            V0.j jVar = new V0.j(rect.left, rect.top, rect.right, rect.bottom);
            this.f4241a = 1;
            obj = f.a(this.f4242b, scrollCaptureSession, jVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        this.f4245e.accept(AbstractC1362A.x((V0.j) obj));
        return q.f3365a;
    }
}
