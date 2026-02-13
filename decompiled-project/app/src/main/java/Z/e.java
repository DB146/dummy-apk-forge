package Z;

import java.util.Map;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final e f12083b = new e(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f12084c = new e(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12085a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i10) {
        super(i7);
        this.f12085a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f12085a) {
            case 0:
                return new g((Map) obj);
            default:
                return obj;
        }
    }
}
