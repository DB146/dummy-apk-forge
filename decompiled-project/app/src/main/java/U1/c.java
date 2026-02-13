package U1;

import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f9458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9459b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9460c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9461d;

    public c(int i7, byte[] bArr, int i10) {
        this(-1L, bArr, i7, i10);
    }

    public c(long j, byte[] bArr, int i7, int i10) {
        this.f9458a = i7;
        this.f9459b = i10;
        this.f9460c = j;
        this.f9461d = bArr;
    }

    public static c a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f9472E[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(4, wrap.array(), 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f9472E[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.f9466a);
        wrap.putInt((int) eVar2.f9467b);
        return new c(5, wrap.array(), 1);
    }

    public static c c(int i7, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f9472E[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i7}[0]);
        return new c(3, wrap.array(), 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g instanceof String) {
            return Double.parseDouble((String) g);
        }
        if (g instanceof long[]) {
            if (((long[]) g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof int[]) {
            if (((int[]) g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f9466a / eVar.f9467b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g instanceof String) {
            return Integer.parseInt((String) g);
        }
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            return null;
        }
        if (g instanceof String) {
            return (String) g;
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            while (i7 < jArr.length) {
                sb2.append(jArr[i7]);
                i7++;
                if (i7 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (g instanceof int[]) {
            int[] iArr = (int[]) g;
            while (i7 < iArr.length) {
                sb2.append(iArr[i7]);
                i7++;
                if (i7 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            while (i7 < dArr.length) {
                sb2.append(dArr[i7]);
                i7++;
                if (i7 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(g instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g;
        while (i7 < eVarArr.length) {
            sb2.append(eVarArr[i7].f9466a);
            sb2.append('/');
            sb2.append(eVarArr[i7].f9467b);
            i7++;
            if (i7 != eVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0129, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:158:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [U1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [U1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        b bVar;
        InputStream inputStream;
        byte b2;
        int i7 = 0;
        byte[] bArr = this.f9461d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f9455b = byteOrder;
                    int i10 = this.f9458a;
                    int i11 = this.f9459b;
                    switch (i10) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                                String str = new String(bArr, g.f9480N);
                                try {
                                    bVar.close();
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b2 + 48)});
                            try {
                                bVar.close();
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i11 >= g.f9473F.length) {
                                int i12 = 0;
                                while (true) {
                                    byte[] bArr2 = g.f9473F;
                                    if (i12 >= bArr2.length) {
                                        i7 = bArr2.length;
                                    } else if (bArr[i12] == bArr2[i12]) {
                                        i12++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            while (i7 < i11) {
                                byte b10 = bArr[i7];
                                if (b10 == 0) {
                                    String sb3 = sb2.toString();
                                    bVar.close();
                                    return sb3;
                                }
                                if (b10 >= 32) {
                                    sb2.append((char) b10);
                                } else {
                                    sb2.append('?');
                                }
                                i7++;
                            }
                            String sb32 = sb2.toString();
                            bVar.close();
                            return sb32;
                        case 3:
                            ?? r15 = new int[i11];
                            while (i7 < i11) {
                                r15[i7] = bVar.readUnsignedShort();
                                i7++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return r15;
                        case 4:
                            ?? r152 = new long[i11];
                            while (i7 < i11) {
                                r152[i7] = bVar.readInt() & 4294967295L;
                                i7++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return r152;
                        case 5:
                            ?? r153 = new e[i11];
                            while (i7 < i11) {
                                r153[i7] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                i7++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                            return r153;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            ?? r154 = new int[i11];
                            while (i7 < i11) {
                                r154[i7] = bVar.readShort();
                                i7++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                            return r154;
                        case 9:
                            ?? r155 = new int[i11];
                            while (i7 < i11) {
                                r155[i7] = bVar.readInt();
                                i7++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e15) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                            return r155;
                        case 10:
                            ?? r156 = new e[i11];
                            while (i7 < i11) {
                                r156[i7] = new e(bVar.readInt(), bVar.readInt());
                                i7++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e16) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                            }
                            return r156;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            ?? r157 = new double[i11];
                            while (i7 < i11) {
                                r157[i7] = bVar.readFloat();
                                i7++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e17) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                            }
                            return r157;
                        case 12:
                            ?? r158 = new double[i11];
                            while (i7 < i11) {
                                r158[i7] = bVar.readDouble();
                                i7++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e18) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                            }
                            return r158;
                        default:
                            try {
                                bVar.close();
                            } catch (IOException e19) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                            }
                            return null;
                    }
                } catch (IOException e20) {
                    e = e20;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e21) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e22) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e22);
                    }
                }
                throw th;
            }
        } catch (IOException e23) {
            e = e23;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.f9471D[this.f9458a]);
        sb2.append(", data length:");
        return A3.c.k(sb2, this.f9461d.length, ")");
    }
}
