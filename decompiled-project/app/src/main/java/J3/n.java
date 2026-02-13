package J3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import g3.C1191j;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class n implements A3.g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5478a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5479b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(m mVar, D3.f fVar) {
        try {
            int k = mVar.k();
            if (!((k & 65496) == 65496 || k == 19789 || k == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + k);
                }
                return -1;
            }
            int g = g(mVar);
            if (g == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) fVar.c(g, byte[].class);
            try {
                return h(mVar, bArr, g);
            } finally {
                fVar.g(bArr);
            }
        } catch (l unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(m mVar) {
        try {
            int k = mVar.k();
            if (k == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int i7 = (k << 8) | mVar.i();
            if (i7 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int i10 = (i7 << 8) | mVar.i();
            if (i10 == -1991225785) {
                mVar.e(21L);
                try {
                    return mVar.i() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (l unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (i10 == 1380533830) {
                mVar.e(4L);
                if (((mVar.k() << 16) | mVar.k()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int k7 = (mVar.k() << 16) | mVar.k();
                if ((k7 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i11 = k7 & 255;
                if (i11 == 88) {
                    mVar.e(4L);
                    short i12 = mVar.i();
                    return (i12 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (i12 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i11 != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                mVar.e(4L);
                return (mVar.i() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((mVar.k() << 16) | mVar.k()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int k10 = (mVar.k() << 16) | mVar.k();
            if (k10 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i13 = 0;
            boolean z8 = k10 == 1635150182;
            mVar.e(4L);
            int i14 = i10 - 16;
            if (i14 % 4 == 0) {
                while (i13 < 5 && i14 > 0) {
                    int k11 = (mVar.k() << 16) | mVar.k();
                    if (k11 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (k11 == 1635150182) {
                        z8 = true;
                    }
                    i13++;
                    i14 -= 4;
                }
            }
            return z8 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (l unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(m mVar) {
        short i7;
        int k;
        long j;
        long e2;
        do {
            short i10 = mVar.i();
            if (i10 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) i10));
                }
                return -1;
            }
            i7 = mVar.i();
            if (i7 == 218) {
                return -1;
            }
            if (i7 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            k = mVar.k() - 2;
            if (i7 == 225) {
                return k;
            }
            j = k;
            e2 = mVar.e(j);
        } while (e2 == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder q10 = h3.o.q(i7, k, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
            q10.append(e2);
            Log.d("DfltImageHeaderParser", q10.toString());
        }
        return -1;
    }

    public static int h(m mVar, byte[] bArr, int i7) {
        ByteOrder byteOrder;
        int n6 = mVar.n(i7, bArr);
        if (n6 != i7) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i7 + ", actually read: " + n6);
            }
            return -1;
        }
        short s3 = 1;
        int i10 = 0;
        byte[] bArr2 = f5478a;
        boolean z8 = bArr != null && i7 > bArr2.length;
        if (z8) {
            int i11 = 0;
            while (true) {
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    z8 = false;
                    break;
                }
                i11++;
            }
        }
        if (!z8) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        k kVar = new k(bArr, i7);
        short b2 = kVar.b(6);
        if (b2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (b2 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) b2));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        ByteBuffer byteBuffer = kVar.f5477a;
        byteBuffer.order(byteOrder);
        int i12 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short b10 = kVar.b(i12 + 6);
        while (i10 < b10) {
            int i13 = (i10 * 12) + i12 + 8;
            short b11 = kVar.b(i13);
            if (b11 == 274) {
                short b12 = kVar.b(i13 + 2);
                if (b12 >= s3 && b12 <= 12) {
                    int i14 = i13 + 4;
                    int i15 = byteBuffer.remaining() - i14 >= 4 ? byteBuffer.getInt(i14) : -1;
                    if (i15 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder q10 = h3.o.q(i10, b11, "Got tagIndex=", " tagType=", " formatCode=");
                            q10.append((int) b12);
                            q10.append(" componentCount=");
                            q10.append(i15);
                            Log.d("DfltImageHeaderParser", q10.toString());
                        }
                        int i16 = i15 + f5479b[b12];
                        if (i16 <= 4) {
                            int i17 = i13 + 8;
                            if (i17 < 0 || i17 > byteBuffer.remaining()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i17 + " tagType=" + ((int) b11));
                                }
                            } else {
                                if (i16 >= 0 && i16 + i17 <= byteBuffer.remaining()) {
                                    return kVar.b(i17);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) b11));
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) b12));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) b12));
                }
            }
            i10++;
            s3 = 1;
        }
        return -1;
    }

    @Override // A3.g
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        W3.g.c(byteBuffer, "Argument must not be null");
        return f(new j(byteBuffer));
    }

    @Override // A3.g
    public final int b(ByteBuffer byteBuffer, D3.f fVar) {
        j jVar = new j(byteBuffer);
        W3.g.c(fVar, "Argument must not be null");
        return e(jVar, fVar);
    }

    @Override // A3.g
    public final int c(InputStream inputStream, D3.f fVar) {
        C1191j c1191j = new C1191j(inputStream, 20);
        W3.g.c(fVar, "Argument must not be null");
        return e(c1191j, fVar);
    }

    @Override // A3.g
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return f(new C1191j(inputStream, 20));
    }
}
