package o4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class S extends z {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[ADDED_TO_REGION, LOOP:4: B:33:0x00ae->B:34:0x00b0, LOOP_START, PHI: r0
      0x00ae: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0036, B:34:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o4.InterfaceC1802p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ByteBuffer byteBuffer) {
        int i7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f21921b.f21869c;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 268435456) {
                    if (i11 == 536870912) {
                        i10 /= 3;
                    } else if (i11 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer j = j(i10);
                i7 = this.f21921b.f21869c;
                if (i7 == 3) {
                    while (position < limit) {
                        j.put((byte) 0);
                        j.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i7 == 4) {
                    while (position < limit) {
                        short h10 = (short) (n5.D.h(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        j.put((byte) (h10 & 255));
                        j.put((byte) ((h10 >> 8) & 255));
                        position += 4;
                    }
                } else if (i7 == 268435456) {
                    while (position < limit) {
                        j.put(byteBuffer.get(position + 1));
                        j.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i7 == 536870912) {
                    while (position < limit) {
                        j.put(byteBuffer.get(position + 1));
                        j.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i7 != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        j.put(byteBuffer.get(position + 2));
                        j.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                j.flip();
            }
            i10 /= 2;
            ByteBuffer j10 = j(i10);
            i7 = this.f21921b.f21869c;
            if (i7 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            j10.flip();
        }
        i10 *= 2;
        ByteBuffer j102 = j(i10);
        i7 = this.f21921b.f21869c;
        if (i7 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        j102.flip();
    }

    @Override // o4.z
    public final C1800n f(C1800n c1800n) {
        int i7 = c1800n.f21869c;
        if (i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4) {
            return i7 != 2 ? new C1800n(c1800n.f21867a, c1800n.f21868b, 2) : C1800n.f21866e;
        }
        throw new C1801o(c1800n);
    }
}
