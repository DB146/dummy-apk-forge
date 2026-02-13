package x3;

import D3.f;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import q3.s;

/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2262d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f26186a;

    /* renamed from: c, reason: collision with root package name */
    public final s f26188c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f26189d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f26190e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f26191f;
    public byte[] g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f26192h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f26193i;
    public final int[] j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public C2260b f26194l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f26195m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f26196n;

    /* renamed from: o, reason: collision with root package name */
    public int f26197o;

    /* renamed from: p, reason: collision with root package name */
    public final int f26198p;

    /* renamed from: q, reason: collision with root package name */
    public final int f26199q;

    /* renamed from: r, reason: collision with root package name */
    public final int f26200r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f26201s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f26187b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f26202t = Bitmap.Config.ARGB_8888;

    public C2262d(s sVar, C2260b c2260b, ByteBuffer byteBuffer, int i7) {
        this.f26188c = sVar;
        this.f26194l = new C2260b();
        synchronized (this) {
            try {
                if (i7 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i7);
                }
                int highestOneBit = Integer.highestOneBit(i7);
                this.f26197o = 0;
                this.f26194l = c2260b;
                this.k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f26189d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f26189d.order(ByteOrder.LITTLE_ENDIAN);
                this.f26196n = false;
                Iterator it = c2260b.f26178e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C2259a) it.next()).g == 3) {
                        this.f26196n = true;
                        break;
                    }
                }
                this.f26198p = highestOneBit;
                int i10 = c2260b.f26179f;
                this.f26200r = i10 / highestOneBit;
                int i11 = c2260b.g;
                this.f26199q = i11 / highestOneBit;
                int i12 = i10 * i11;
                f fVar = (f) this.f26188c.f23439c;
                this.f26193i = fVar == null ? new byte[i12] : (byte[]) fVar.c(i12, byte[].class);
                s sVar2 = this.f26188c;
                int i13 = this.f26200r * this.f26199q;
                f fVar2 = (f) sVar2.f23439c;
                this.j = fVar2 == null ? new int[i13] : (int[]) fVar2.c(i13, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f26201s;
        Bitmap d10 = ((D3.a) this.f26188c.f23438b).d(this.f26200r, this.f26199q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f26202t);
        d10.setHasAlpha(true);
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap b() {
        int i7;
        int[] iArr;
        try {
            if (this.f26194l.f26176c > 0) {
                if (this.k < 0) {
                }
                i7 = this.f26197o;
                if (i7 != 1 && i7 != 2) {
                    this.f26197o = 0;
                    if (this.f26190e == null) {
                        f fVar = (f) this.f26188c.f23439c;
                        this.f26190e = fVar == null ? new byte[255] : (byte[]) fVar.c(255, byte[].class);
                    }
                    C2259a c2259a = (C2259a) this.f26194l.f26178e.get(this.k);
                    int i10 = this.k - 1;
                    C2259a c2259a2 = i10 < 0 ? (C2259a) this.f26194l.f26178e.get(i10) : null;
                    iArr = c2259a.k;
                    if (iArr != null) {
                        iArr = this.f26194l.f26174a;
                    }
                    this.f26186a = iArr;
                    if (iArr != null) {
                        if (Log.isLoggable("d", 3)) {
                            Log.d("d", "No valid color table found for frame #" + this.k);
                        }
                        this.f26197o = 1;
                        return null;
                    }
                    if (c2259a.f26171f) {
                        System.arraycopy(iArr, 0, this.f26187b, 0, iArr.length);
                        int[] iArr2 = this.f26187b;
                        this.f26186a = iArr2;
                        iArr2[c2259a.f26172h] = 0;
                        if (c2259a.g == 2 && this.k == 0) {
                            this.f26201s = Boolean.TRUE;
                        }
                    }
                    return d(c2259a, c2259a2);
                }
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, status=" + this.f26197o);
                }
                return null;
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, frameCount=" + this.f26194l.f26176c + ", framePointer=" + this.k);
            }
            this.f26197o = 1;
            i7 = this.f26197o;
            if (i7 != 1) {
                this.f26197o = 0;
                if (this.f26190e == null) {
                }
                C2259a c2259a3 = (C2259a) this.f26194l.f26178e.get(this.k);
                int i102 = this.k - 1;
                if (i102 < 0) {
                }
                iArr = c2259a3.k;
                if (iArr != null) {
                }
                this.f26186a = iArr;
                if (iArr != null) {
                }
            }
            if (Log.isLoggable("d", 3)) {
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f26202t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r3.j == r34.f26172h) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap d(C2259a c2259a, C2259a c2259a2) {
        int[] iArr;
        byte b2;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        short s3;
        int i22;
        Bitmap bitmap;
        int i23;
        int i24;
        int i25;
        int[] iArr2 = this.j;
        s sVar = this.f26188c;
        byte b10 = 0;
        if (c2259a2 == null) {
            Bitmap bitmap2 = this.f26195m;
            if (bitmap2 != null) {
                ((D3.a) sVar.f23438b).g(bitmap2);
            }
            this.f26195m = null;
            Arrays.fill(iArr2, 0);
        }
        if (c2259a2 != null && c2259a2.g == 3 && this.f26195m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (c2259a2 != null && (i22 = c2259a2.g) > 0) {
            if (i22 == 2) {
                if (!c2259a.f26171f) {
                    C2260b c2260b = this.f26194l;
                    i23 = c2260b.k;
                    if (c2259a.k != null) {
                    }
                    int i26 = c2259a2.f26169d;
                    int i27 = this.f26198p;
                    int i28 = i26 / i27;
                    int i29 = c2259a2.f26167b / i27;
                    int i30 = c2259a2.f26168c / i27;
                    int i31 = c2259a2.f26166a / i27;
                    int i32 = this.f26200r;
                    i24 = (i29 * i32) + i31;
                    i25 = (i28 * i32) + i24;
                    while (i24 < i25) {
                        int i33 = i24 + i30;
                        for (int i34 = i24; i34 < i33; i34++) {
                            iArr2[i34] = i23;
                        }
                        i24 += this.f26200r;
                    }
                }
                i23 = 0;
                int i262 = c2259a2.f26169d;
                int i272 = this.f26198p;
                int i282 = i262 / i272;
                int i292 = c2259a2.f26167b / i272;
                int i302 = c2259a2.f26168c / i272;
                int i312 = c2259a2.f26166a / i272;
                int i322 = this.f26200r;
                i24 = (i292 * i322) + i312;
                i25 = (i282 * i322) + i24;
                while (i24 < i25) {
                }
            } else if (i22 == 3 && (bitmap = this.f26195m) != null) {
                int i35 = this.f26200r;
                bitmap.getPixels(iArr2, 0, i35, 0, 0, i35, this.f26199q);
            }
        }
        this.f26189d.position(c2259a.j);
        int i36 = c2259a.f26168c * c2259a.f26169d;
        byte[] bArr = this.f26193i;
        if (bArr == null || bArr.length < i36) {
            f fVar = (f) sVar.f23439c;
            this.f26193i = fVar == null ? new byte[i36] : (byte[]) fVar.c(i36, byte[].class);
        }
        byte[] bArr2 = this.f26193i;
        if (this.f26191f == null) {
            this.f26191f = new short[4096];
        }
        short[] sArr = this.f26191f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.f26192h == null) {
            this.f26192h = new byte[4097];
        }
        byte[] bArr4 = this.f26192h;
        int i37 = this.f26189d.get() & 255;
        int i38 = 1 << i37;
        int i39 = i38 + 1;
        int i40 = i38 + 2;
        int i41 = i37 + 1;
        int i42 = (1 << i41) - 1;
        for (int i43 = 0; i43 < i38; i43++) {
            sArr[i43] = 0;
            bArr3[i43] = (byte) i43;
        }
        byte[] bArr5 = this.f26190e;
        int i44 = i41;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        short s10 = 0;
        int i51 = 0;
        int i52 = i40;
        int i53 = i42;
        short s11 = -1;
        while (true) {
            if (i45 >= i36) {
                iArr = iArr2;
                b2 = b10;
                i7 = i50;
                break;
            }
            if (i46 == 0) {
                int i54 = this.f26189d.get() & 255;
                if (i54 <= 0) {
                    i20 = i41;
                    i21 = i45;
                } else {
                    ByteBuffer byteBuffer = this.f26189d;
                    i20 = i41;
                    i21 = i45;
                    byteBuffer.get(this.f26190e, 0, Math.min(i54, byteBuffer.remaining()));
                }
                if (i54 <= 0) {
                    this.f26197o = 3;
                    iArr = iArr2;
                    i7 = i50;
                    b2 = 0;
                    break;
                }
                i46 = i54;
                i47 = 0;
            } else {
                i20 = i41;
                i21 = i45;
            }
            i49 += (bArr5[i47] & 255) << i48;
            i47++;
            i46--;
            short s12 = s11;
            int i55 = i48 + 8;
            int i56 = i52;
            int i57 = i44;
            i45 = i21;
            byte[] bArr6 = bArr5;
            short s13 = s10;
            while (true) {
                if (i55 < i57) {
                    s10 = s13;
                    i44 = i57;
                    i48 = i55;
                    i52 = i56;
                    bArr5 = bArr6;
                    i41 = i20;
                    b10 = 0;
                    s11 = s12;
                    break;
                }
                int[] iArr3 = iArr2;
                int i58 = i49 & i53;
                i49 >>= i57;
                i55 -= i57;
                if (i58 == i38) {
                    i56 = i40;
                    i53 = i42;
                    iArr2 = iArr3;
                    i57 = i20;
                    s12 = -1;
                } else {
                    if (i58 == i39) {
                        s10 = s13;
                        i44 = i57;
                        i52 = i56;
                        bArr5 = bArr6;
                        iArr2 = iArr3;
                        i41 = i20;
                        s11 = s12;
                        i48 = i55;
                        b10 = 0;
                        break;
                    }
                    if (s12 == -1) {
                        bArr2[i50] = bArr3[i58 == true ? 1 : 0];
                        i50++;
                        i45++;
                        s13 = i58 == true ? 1 : 0;
                        s12 = s13;
                        iArr2 = iArr3;
                        i55 = i55;
                    } else {
                        if (i58 >= i56) {
                            bArr4[i51] = (byte) s13;
                            i51++;
                            s3 = s12;
                        } else {
                            s3 = i58 == true ? 1 : 0;
                        }
                        while (s3 >= i38) {
                            bArr4[i51] = bArr3[s3];
                            i51++;
                            s3 = sArr[s3];
                        }
                        boolean z8 = bArr3[s3] & 255;
                        byte b11 = z8 ? (byte) 1 : (byte) 0;
                        bArr2[i50] = b11;
                        while (true) {
                            i50++;
                            i45++;
                            if (i51 <= 0) {
                                break;
                            }
                            i51--;
                            bArr2[i50] = bArr4[i51];
                        }
                        if (i56 < 4096) {
                            sArr[i56] = s12;
                            bArr3[i56] = b11;
                            i56++;
                            if ((i56 & i53) == 0 && i56 < 4096) {
                                i57++;
                                i53 += i56;
                            }
                        }
                        s12 = i58 == true ? 1 : 0;
                        iArr2 = iArr3;
                        i55 = i55;
                        s13 = z8 ? 1 : 0;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i7, i36, b2);
        if (c2259a.f26170e || this.f26198p != 1) {
            int[] iArr4 = this.j;
            int i59 = c2259a.f26169d;
            int i60 = this.f26198p;
            int i61 = i59 / i60;
            int i62 = c2259a.f26167b / i60;
            int i63 = c2259a.f26168c / i60;
            int i64 = c2259a.f26166a / i60;
            boolean z10 = this.k == 0;
            int i65 = this.f26200r;
            int i66 = this.f26199q;
            byte[] bArr7 = this.f26193i;
            int[] iArr5 = this.f26186a;
            Boolean bool = this.f26201s;
            int i67 = 8;
            int i68 = 0;
            int i69 = 0;
            int i70 = 1;
            while (i68 < i61) {
                Boolean bool2 = bool;
                if (c2259a.f26170e) {
                    if (i69 >= i61) {
                        int i71 = i70 + 1;
                        i10 = i61;
                        if (i71 == 2) {
                            i69 = 4;
                        } else if (i71 == 3) {
                            i67 = 4;
                            i70 = i71;
                            i69 = 2;
                        } else if (i71 == 4) {
                            i70 = i71;
                            i69 = 1;
                            i67 = 2;
                        }
                        i70 = i71;
                    } else {
                        i10 = i61;
                    }
                    i11 = i69 + i67;
                } else {
                    i10 = i61;
                    i11 = i69;
                    i69 = i68;
                }
                int i72 = i69 + i62;
                boolean z11 = i60 == 1;
                if (i72 < i66) {
                    int i73 = i72 * i65;
                    int i74 = i73 + i64;
                    i12 = i11;
                    int i75 = i74 + i63;
                    int i76 = i73 + i65;
                    if (i76 < i75) {
                        i75 = i76;
                    }
                    i13 = i62;
                    int i77 = i68 * i60 * c2259a.f26168c;
                    if (z11) {
                        bool = bool2;
                        int i78 = i74;
                        while (i78 < i75) {
                            int i79 = i63;
                            int i80 = iArr5[bArr7[i77] & 255];
                            if (i80 != 0) {
                                iArr4[i78] = i80;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i77 += i60;
                            i78++;
                            i63 = i79;
                        }
                        i14 = i63;
                    } else {
                        i14 = i63;
                        int i81 = ((i75 - i74) * i60) + i77;
                        bool = bool2;
                        int i82 = i74;
                        while (i82 < i75) {
                            int i83 = i75;
                            int i84 = c2259a.f26168c;
                            int i85 = i64;
                            int i86 = i65;
                            int i87 = i77;
                            int i88 = 0;
                            int i89 = 0;
                            int i90 = 0;
                            int i91 = 0;
                            int i92 = 0;
                            while (true) {
                                if (i87 >= this.f26198p + i77) {
                                    i18 = i66;
                                    break;
                                }
                                byte[] bArr8 = this.f26193i;
                                i18 = i66;
                                if (i87 >= bArr8.length || i87 >= i81) {
                                    break;
                                }
                                int i93 = this.f26186a[bArr8[i87] & 255];
                                if (i93 != 0) {
                                    i88 += (i93 >> 24) & 255;
                                    i89 += (i93 >> 16) & 255;
                                    i90 += (i93 >> 8) & 255;
                                    i91 += i93 & 255;
                                    i92++;
                                }
                                i87++;
                                i66 = i18;
                            }
                            int i94 = i84 + i77;
                            for (int i95 = i94; i95 < this.f26198p + i94; i95++) {
                                byte[] bArr9 = this.f26193i;
                                if (i95 >= bArr9.length || i95 >= i81) {
                                    break;
                                }
                                int i96 = this.f26186a[bArr9[i95] & 255];
                                if (i96 != 0) {
                                    i88 += (i96 >> 24) & 255;
                                    i89 += (i96 >> 16) & 255;
                                    i90 += (i96 >> 8) & 255;
                                    i91 += i96 & 255;
                                    i92++;
                                }
                            }
                            int i97 = i92 == 0 ? 0 : ((i88 / i92) << 24) | ((i89 / i92) << 16) | ((i90 / i92) << 8) | (i91 / i92);
                            if (i97 != 0) {
                                iArr4[i82] = i97;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i77 += i60;
                            i82++;
                            i75 = i83;
                            i64 = i85;
                            i65 = i86;
                            i66 = i18;
                        }
                    }
                    i15 = i64;
                    i16 = i65;
                    i17 = i66;
                } else {
                    i12 = i11;
                    i13 = i62;
                    i14 = i63;
                    i15 = i64;
                    i16 = i65;
                    i17 = i66;
                    bool = bool2;
                }
                i68++;
                i61 = i10;
                i69 = i12;
                i62 = i13;
                i63 = i14;
                i64 = i15;
                i65 = i16;
                i66 = i17;
            }
            Boolean bool3 = bool;
            if (this.f26201s == null) {
                this.f26201s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr6 = this.j;
            int i98 = c2259a.f26169d;
            int i99 = c2259a.f26167b;
            int i100 = c2259a.f26168c;
            int i101 = c2259a.f26166a;
            byte b12 = this.k == 0 ? (byte) 1 : b2;
            int i102 = this.f26200r;
            byte[] bArr10 = this.f26193i;
            int[] iArr7 = this.f26186a;
            int i103 = -1;
            for (int i104 = b2; i104 < i98; i104++) {
                int i105 = (i104 + i99) * i102;
                int i106 = i105 + i101;
                int i107 = i106 + i100;
                int i108 = i105 + i102;
                if (i108 < i107) {
                    i107 = i108;
                }
                int i109 = c2259a.f26168c * i104;
                while (i106 < i107) {
                    int i110 = i98;
                    int i111 = bArr10[i109];
                    int i112 = i99;
                    int i113 = i111 & 255;
                    if (i113 != i103) {
                        int i114 = iArr7[i113];
                        if (i114 != 0) {
                            iArr6[i106] = i114;
                        } else {
                            i103 = i111;
                        }
                    }
                    i109++;
                    i106++;
                    i98 = i110;
                    i99 = i112;
                }
            }
            Boolean bool4 = this.f26201s;
            this.f26201s = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || !(this.f26201s != null || b12 == 0 || i103 == -1));
        }
        if (this.f26196n && ((i19 = c2259a.g) == 0 || i19 == 1)) {
            if (this.f26195m == null) {
                this.f26195m = a();
            }
            Bitmap bitmap3 = this.f26195m;
            int i115 = this.f26200r;
            bitmap3.setPixels(iArr, 0, i115, 0, 0, i115, this.f26199q);
        }
        Bitmap a9 = a();
        int i116 = this.f26200r;
        a9.setPixels(iArr, 0, i116, 0, 0, i116, this.f26199q);
        return a9;
    }
}
