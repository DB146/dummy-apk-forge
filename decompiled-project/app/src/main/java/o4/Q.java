package o4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Q extends z {

    /* renamed from: i, reason: collision with root package name */
    public static final int f21810i = Float.floatToIntBits(Float.NaN);

    @Override // o4.InterfaceC1802p
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i10 = this.f21921b.f21869c;
        int i11 = f21810i;
        if (i10 == 536870912) {
            j = j((i7 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == i11) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                j.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i10 != 805306368) {
                throw new IllegalStateException();
            }
            j = j(i7);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i11) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                j.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }

    @Override // o4.z
    public final C1800n f(C1800n c1800n) {
        int i7 = c1800n.f21869c;
        if (i7 == 536870912 || i7 == 805306368 || i7 == 4) {
            return i7 != 4 ? new C1800n(c1800n.f21867a, c1800n.f21868b, 4) : C1800n.f21866e;
        }
        throw new C1801o(c1800n);
    }
}
