package Z0;

import java.util.UUID;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class c extends m implements Rb.a {

    /* renamed from: b, reason: collision with root package name */
    public static final c f12106b = new c(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f12107c = new c(0, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12108a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, int i10) {
        super(i7);
        this.f12108a = i10;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f12108a) {
            case 0:
                return UUID.randomUUID();
            default:
                return "DEFAULT_TEST_TAG";
        }
    }
}
