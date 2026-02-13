package Ib;

import Hb.d;
import Hb.i;
import Rb.e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

/* loaded from: classes2.dex */
public final class c extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public int f5352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f5353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f5354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, i iVar, e eVar, d dVar2) {
        super(dVar, iVar);
        this.f5353b = eVar;
        this.f5354c = dVar2;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f5352a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f5352a = 2;
            com.bumptech.glide.c.c0(obj);
            return obj;
        }
        this.f5352a = 1;
        com.bumptech.glide.c.c0(obj);
        e eVar = this.f5353b;
        l.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        y.b(2, eVar);
        return eVar.invoke(this.f5354c, this);
    }
}
