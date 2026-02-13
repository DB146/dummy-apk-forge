package z;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2547c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2545b f27963a = C2545b.f27960a;

    default float a(float f4, float f10, float f11) {
        f27963a.getClass();
        float f12 = f10 + f4;
        if ((f4 >= 0.0f && f12 <= f11) || (f4 < 0.0f && f12 > f11)) {
            return 0.0f;
        }
        float f13 = f12 - f11;
        return Math.abs(f4) < Math.abs(f13) ? f4 : f13;
    }
}
