package z;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2551e implements InterfaceC2547c {
    @Override // z.InterfaceC2547c
    public final float a(float f4, float f10, float f11) {
        float abs = Math.abs((f10 + f4) - f4);
        float f12 = (0.3f * f11) - (0.0f * abs);
        float f13 = f11 - f12;
        if ((abs <= f11) && f13 < abs) {
            f12 = f11 - abs;
        }
        return f4 - f12;
    }
}
