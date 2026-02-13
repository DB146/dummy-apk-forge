package Ib;

import Hb.d;
import Jb.g;
import Rb.e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public int f5349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f5350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f5351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, d dVar2, e eVar) {
        super(dVar);
        this.f5350b = eVar;
        this.f5351c = dVar2;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f5349a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f5349a = 2;
            com.bumptech.glide.c.c0(obj);
            return obj;
        }
        this.f5349a = 1;
        com.bumptech.glide.c.c0(obj);
        e eVar = this.f5350b;
        l.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        y.b(2, eVar);
        return eVar.invoke(this.f5351c, this);
    }
}
