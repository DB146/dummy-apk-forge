package com.google.android.gms.internal.pal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzabe implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final String zzg;
    private boolean zzh;
    private String zzi;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            zzb[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzabe(Writer writer) {
        zzo(6);
        this.zzg = ":";
        this.zzd = writer;
    }

    private final int zzk() {
        int i7 = this.zzf;
        if (i7 != 0) {
            return this.zze[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final zzabe zzl(int i7, int i10, char c10) {
        int zzk = zzk();
        if (zzk != i10 && zzk != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzi;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        this.zzd.write(c10);
        return this;
    }

    private final zzabe zzm(int i7, char c10) {
        zzn();
        zzo(i7);
        this.zzd.write(c10);
        return this;
    }

    private final void zzn() {
        int zzk = zzk();
        if (zzk == 1) {
            zzp(2);
            return;
        }
        if (zzk == 2) {
            this.zzd.append(',');
            return;
        }
        if (zzk == 4) {
            this.zzd.append((CharSequence) this.zzg);
            zzp(5);
            return;
        }
        if (zzk != 6) {
            if (zzk != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.zzh) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        zzp(7);
    }

    private final void zzo(int i7) {
        int i10 = this.zzf;
        int[] iArr = this.zze;
        if (i10 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i10 + i10);
        }
        int[] iArr2 = this.zze;
        int i11 = this.zzf;
        this.zzf = i11 + 1;
        iArr2[i11] = i7;
    }

    private final void zzp(int i7) {
        this.zze[this.zzf - 1] = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzq(String str) {
        int i7;
        String str2;
        String[] strArr = zzb;
        this.zzd.write(34);
        int length = str.length();
        int i10 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i7 = str2 == null ? i7 + 1 : 0;
                if (i10 < i7) {
                    this.zzd.write(str, i10, i7 - i10);
                }
                this.zzd.write(str2);
                i10 = i7 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i7) {
                }
                this.zzd.write(str2);
                i10 = i7 + 1;
            }
        }
        if (i10 < length) {
            this.zzd.write(str, i10, length - i10);
        }
        this.zzd.write(34);
    }

    private final void zzr() {
        if (this.zzi != null) {
            int zzk = zzk();
            if (zzk == 5) {
                this.zzd.write(44);
            } else if (zzk != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzp(4);
            zzq(this.zzi);
            this.zzi = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zzd.close();
        int i7 = this.zzf;
        if (i7 > 1 || (i7 == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final zzabe zza() {
        zzr();
        zzm(1, '[');
        return this;
    }

    public final zzabe zzb() {
        zzr();
        zzm(3, '{');
        return this;
    }

    public final zzabe zzc() {
        zzl(1, 2, ']');
        return this;
    }

    public final zzabe zzd() {
        zzl(3, 5, '}');
        return this;
    }

    public final zzabe zze(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.zzi != null) {
            throw new IllegalStateException();
        }
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzi = str;
        return this;
    }

    public final zzabe zzf() {
        if (this.zzi != null) {
            zzr();
        }
        zzn();
        this.zzd.write("null");
        return this;
    }

    public final zzabe zzg(Number number) {
        zzr();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !zza.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.zzh) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        zzn();
        this.zzd.append((CharSequence) obj);
        return this;
    }

    public final zzabe zzh(String str) {
        if (str == null) {
            zzf();
            return this;
        }
        zzr();
        zzn();
        zzq(str);
        return this;
    }

    public final zzabe zzi(boolean z8) {
        zzr();
        zzn();
        this.zzd.write(true != z8 ? "false" : "true");
        return this;
    }

    public final void zzj(boolean z8) {
        this.zzh = true;
    }
}
