package O8;

import G8.i;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f7519B;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f7521a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f7522b;

    /* renamed from: c, reason: collision with root package name */
    public int f7523c;

    /* renamed from: d, reason: collision with root package name */
    public i f7524d;

    /* renamed from: e, reason: collision with root package name */
    public String f7525e;

    /* renamed from: f, reason: collision with root package name */
    public String f7526f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7527u;

    /* renamed from: v, reason: collision with root package name */
    public int f7528v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7529w;

    /* renamed from: x, reason: collision with root package name */
    public String f7530x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7531y;

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f7520z = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f7518A = new String[128];

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f7518A[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f7518A;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f7519B = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f7522b = iArr;
        this.f7523c = 0;
        if (iArr.length == 0) {
            this.f7522b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f7522b;
        int i7 = this.f7523c;
        this.f7523c = i7 + 1;
        iArr2[i7] = 6;
        this.f7528v = 2;
        this.f7531y = true;
        Objects.requireNonNull(writer, "out == null");
        this.f7521a = writer;
        Y(i.f4371d);
    }

    public void F() {
        g0();
        l();
        int i7 = this.f7523c;
        int[] iArr = this.f7522b;
        if (i7 == iArr.length) {
            this.f7522b = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f7522b;
        int i10 = this.f7523c;
        this.f7523c = i10 + 1;
        iArr2[i10] = 3;
        this.f7521a.write(123);
    }

    public final void K(int i7, int i10, char c10) {
        int X10 = X();
        if (X10 != i10 && X10 != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f7530x != null) {
            throw new IllegalStateException("Dangling name: " + this.f7530x);
        }
        this.f7523c--;
        if (X10 == i10) {
            V();
        }
        this.f7521a.write(c10);
    }

    public void P() {
        K(1, 2, ']');
    }

    public void T() {
        K(3, 5, '}');
    }

    public void U(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f7530x != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int X10 = X();
        if (X10 != 3 && X10 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f7530x = str;
    }

    public final void V() {
        if (this.f7527u) {
            return;
        }
        String str = this.f7524d.f4372a;
        Writer writer = this.f7521a;
        writer.write(str);
        int i7 = this.f7523c;
        for (int i10 = 1; i10 < i7; i10++) {
            writer.write(this.f7524d.f4373b);
        }
    }

    public b W() {
        if (this.f7530x != null) {
            if (!this.f7531y) {
                this.f7530x = null;
                return this;
            }
            g0();
        }
        l();
        this.f7521a.write("null");
        return this;
    }

    public final int X() {
        int i7 = this.f7523c;
        if (i7 != 0) {
            return this.f7522b[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void Y(i iVar) {
        Objects.requireNonNull(iVar);
        this.f7524d = iVar;
        this.f7526f = ",";
        if (iVar.f4374c) {
            this.f7525e = ": ";
            if (iVar.f4372a.isEmpty()) {
                this.f7526f = ", ";
            }
        } else {
            this.f7525e = ":";
        }
        this.f7527u = this.f7524d.f4372a.isEmpty() && this.f7524d.f4373b.isEmpty();
    }

    public final void Z(int i7) {
        if (i7 == 0) {
            throw null;
        }
        this.f7528v = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(String str) {
        int i7;
        String str2;
        String[] strArr = this.f7529w ? f7519B : f7518A;
        Writer writer = this.f7521a;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i7 = str2 == null ? i7 + 1 : 0;
                if (i10 < i7) {
                    writer.write(str, i10, i7 - i10);
                }
                writer.write(str2);
                i10 = i7 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i7) {
                }
                writer.write(str2);
                i10 = i7 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void b0(double d10) {
        g0();
        if (this.f7528v == 1 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            l();
            this.f7521a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void c0(long j) {
        g0();
        l();
        this.f7521a.write(Long.toString(j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7521a.close();
        int i7 = this.f7523c;
        if (i7 > 1 || (i7 == 1 && this.f7522b[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f7523c = 0;
    }

    public void d0(Number number) {
        if (number == null) {
            W();
            return;
        }
        g0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.f7528v != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
                }
            } else if (cls != Float.class && cls != Double.class && !f7520z.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        }
        l();
        this.f7521a.append((CharSequence) obj);
    }

    public void e0(String str) {
        if (str == null) {
            W();
            return;
        }
        g0();
        l();
        a0(str);
    }

    public void f0(boolean z8) {
        g0();
        l();
        this.f7521a.write(z8 ? "true" : "false");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f7523c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f7521a.flush();
    }

    public final void g0() {
        if (this.f7530x != null) {
            int X10 = X();
            if (X10 == 5) {
                this.f7521a.write(this.f7526f);
            } else if (X10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            V();
            this.f7522b[this.f7523c - 1] = 4;
            a0(this.f7530x);
            this.f7530x = null;
        }
    }

    public final void l() {
        int X10 = X();
        if (X10 == 1) {
            this.f7522b[this.f7523c - 1] = 2;
            V();
            return;
        }
        Writer writer = this.f7521a;
        if (X10 == 2) {
            writer.append((CharSequence) this.f7526f);
            V();
        } else {
            if (X10 == 4) {
                writer.append((CharSequence) this.f7525e);
                this.f7522b[this.f7523c - 1] = 5;
                return;
            }
            if (X10 != 6) {
                if (X10 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f7528v != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f7522b[this.f7523c - 1] = 7;
        }
    }

    public void n() {
        g0();
        l();
        int i7 = this.f7523c;
        int[] iArr = this.f7522b;
        if (i7 == iArr.length) {
            this.f7522b = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f7522b;
        int i10 = this.f7523c;
        this.f7523c = i10 + 1;
        iArr2[i10] = 1;
        this.f7521a.write(91);
    }
}
