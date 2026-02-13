package Z;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: b, reason: collision with root package name */
    public static final h f12095b = new h(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f12096c = new h(0, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12097a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i10) {
        super(i7);
        this.f12097a = i10;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f12097a) {
            case 0:
                return new g(new LinkedHashMap());
            default:
                return null;
        }
    }
}
