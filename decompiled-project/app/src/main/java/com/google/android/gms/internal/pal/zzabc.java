package com.google.android.gms.internal.pal;

import P1.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzabc implements Closeable {
    private final Reader zzb;
    private long zzh;
    private int zzi;
    private int[] zzj;
    private String[] zzl;
    private int[] zzm;
    private final char[] zzc = new char[1024];
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    int zza = 0;
    private int zzk = 1;

    static {
        zzzi.zza = new zzabb();
    }

    public zzabc(Reader reader) {
        int[] iArr = new int[32];
        this.zzj = iArr;
        iArr[0] = 6;
        this.zzl = new String[32];
        this.zzm = new int[32];
        this.zzb = reader;
    }

    private final int zzm(boolean z8) {
        char[] cArr = this.zzc;
        int i7 = this.zzd;
        int i10 = this.zze;
        while (true) {
            if (i7 == i10) {
                this.zzd = i7;
                if (!zzr(1)) {
                    if (z8) {
                        throw new EOFException("End of input".concat(zzb()));
                    }
                    return -1;
                }
                i7 = this.zzd;
                i10 = this.zze;
            }
            int i11 = i7 + 1;
            char c10 = cArr[i7];
            if (c10 == '\n') {
                this.zzf++;
                this.zzg = i11;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 != '/') {
                    if (c10 != '#') {
                        this.zzd = i11;
                        return c10;
                    }
                    this.zzd = i11;
                    throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                this.zzd = i11;
                if (i11 == i10) {
                    this.zzd = i7;
                    boolean zzr = zzr(2);
                    this.zzd++;
                    if (!zzr) {
                        return 47;
                    }
                }
                throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            i7 = i11;
        }
    }

    private final IOException zzn(String str) {
        throw new zzabf(str.concat(zzb()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0119, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x011b, code lost:
    
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0128, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.zzd = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e2, code lost:
    
        throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(r4, r10.zzd, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzo(char c10) {
        int i7;
        char[] cArr = this.zzc;
        StringBuilder sb2 = null;
        loop0: do {
            int i10 = this.zzd;
            int i11 = this.zze;
            while (true) {
                int i12 = i11;
                int i13 = i10;
                while (i10 < i12) {
                    int i14 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.zzd = i14;
                        int i15 = (i14 - i13) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb2.append(cArr, i13, i15);
                        return sb2.toString();
                    }
                    char c12 = '\n';
                    if (c11 == '\\') {
                        this.zzd = i14;
                        int i16 = i14 - i13;
                        int i17 = i16 - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i16 + i16, 16));
                        }
                        sb2.append(cArr, i13, i17);
                        if (this.zzd == this.zze && !zzr(1)) {
                            throw zzn("Unterminated escape sequence");
                        }
                        char[] cArr2 = this.zzc;
                        int i18 = this.zzd;
                        int i19 = i18 + 1;
                        this.zzd = i19;
                        char c13 = cArr2[i18];
                        if (c13 == '\n') {
                            this.zzf++;
                            this.zzg = i19;
                        } else if (c13 != '\"' && c13 != '\'' && c13 != '/' && c13 != '\\') {
                            if (c13 == 'b') {
                                c12 = '\b';
                            } else if (c13 == 'f') {
                                c12 = '\f';
                            } else if (c13 == 'n') {
                                continue;
                            } else if (c13 == 'r') {
                                c12 = '\r';
                            } else if (c13 == 't') {
                                c12 = '\t';
                            } else {
                                if (c13 != 'u') {
                                    throw zzn("Invalid escape sequence");
                                }
                                if (i18 + 5 > this.zze && !zzr(4)) {
                                    throw zzn("Unterminated escape sequence");
                                }
                                int i20 = this.zzd;
                                int i21 = i20 + 4;
                                c12 = 0;
                                while (i20 < i21) {
                                    char[] cArr3 = this.zzc;
                                    char c14 = cArr3[i20];
                                    char c15 = (char) (c12 << 4);
                                    if (c14 >= '0' && c14 <= '9') {
                                        i7 = c14 - '0';
                                    } else if (c14 >= 'a' && c14 <= 'f') {
                                        i7 = c14 - 'W';
                                    } else {
                                        if (c14 < 'A' || c14 > 'F') {
                                            break loop0;
                                        }
                                        i7 = c14 - '7';
                                    }
                                    c12 = (char) (i7 + c15);
                                    i20++;
                                }
                                this.zzd += 4;
                            }
                            sb2.append(c12);
                            i10 = this.zzd;
                            i11 = this.zze;
                        }
                        c12 = c13;
                        sb2.append(c12);
                        i10 = this.zzd;
                        i11 = this.zze;
                    } else {
                        if (c11 == '\n') {
                            this.zzf++;
                            this.zzg = i14;
                        }
                        i10 = i14;
                    }
                }
                break;
            }
        } while (zzr(1));
        throw zzn("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x004e, code lost:
    
        throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzp() {
        String sb2;
        StringBuilder sb3 = null;
        int i7 = 0;
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.zzd + i10;
                if (i11 < this.zze) {
                    char c10 = this.zzc[i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i10 >= 1024) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i10, 16));
                    }
                    sb3.append(this.zzc, this.zzd, i10);
                    this.zzd += i10;
                } else if (!zzr(i10 + 1)) {
                }
            }
            i7 = i10;
            if (sb3 != null) {
                sb2 = new String(this.zzc, this.zzd, i7);
            } else {
                sb3.append(this.zzc, this.zzd, i7);
                sb2 = sb3.toString();
            }
            this.zzd += i7;
            return sb2;
        } while (zzr(1));
        if (sb3 != null) {
        }
        this.zzd += i7;
        return sb2;
    }

    private final void zzq(int i7) {
        int i10 = this.zzk;
        int[] iArr = this.zzj;
        if (i10 == iArr.length) {
            int i11 = i10 + i10;
            this.zzj = Arrays.copyOf(iArr, i11);
            this.zzm = Arrays.copyOf(this.zzm, i11);
            this.zzl = (String[]) Arrays.copyOf(this.zzl, i11);
        }
        int[] iArr2 = this.zzj;
        int i12 = this.zzk;
        this.zzk = i12 + 1;
        iArr2[i12] = i7;
    }

    private final boolean zzr(int i7) {
        int i10;
        char[] cArr = this.zzc;
        int i11 = this.zzg;
        int i12 = this.zzd;
        this.zzg = i11 - i12;
        int i13 = this.zze;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.zze = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.zze = 0;
        }
        this.zzd = 0;
        do {
            Reader reader = this.zzb;
            int i15 = this.zze;
            int read = reader.read(cArr, i15, 1024 - i15);
            if (read == -1) {
                return false;
            }
            i10 = this.zze + read;
            this.zze = i10;
            if (this.zzf == 0 && this.zzg == 0 && i10 > 0 && cArr[0] == 65279) {
                this.zzd++;
                this.zzg = 1;
                i7++;
            }
        } while (i10 < i7);
        return true;
    }

    private final boolean zzs(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza = 0;
        this.zzj[0] = 8;
        this.zzk = 1;
        this.zzb.close();
    }

    public final String toString() {
        return "zzabc".concat(zzb());
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01bd, code lost:
    
        if (zzs(r14) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c1, code lost:
    
        if (r9 != 2) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c3, code lost:
    
        if (r17 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c9, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cb, code lost:
    
        if (r18 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01cd, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d5, code lost:
    
        if (r12 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d7, code lost:
    
        if (r3 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01dd, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01de, code lost:
    
        r22.zzh = r12;
        r22.zzd += r8;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e7, code lost:
    
        r22.zza = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01da, code lost:
    
        if (r3 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d1, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cf, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ea, code lost:
    
        if (r9 == 2) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ed, code lost:
    
        if (r9 == 4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f0, code lost:
    
        if (r9 != 7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f2, code lost:
    
        r22.zzi = r8;
        r6 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0244 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0229 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza() {
        int zzm;
        int i7;
        String str;
        String str2;
        String str3;
        int i10;
        char c10;
        int i11;
        char c11;
        int i12;
        int[] iArr = this.zzj;
        int i13 = this.zzk - 1;
        int i14 = iArr[i13];
        boolean z8 = true;
        if (i14 == 1) {
            iArr[i13] = 2;
        } else if (i14 == 2) {
            int zzm2 = zzm(true);
            if (zzm2 != 44) {
                if (zzm2 == 59) {
                    throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (zzm2 != 93) {
                    throw zzn("Unterminated array");
                }
                this.zza = 4;
                return 4;
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13] = 4;
                if (i14 == 5 && (zzm = zzm(true)) != 44) {
                    if (zzm == 59) {
                        throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                    if (zzm != 125) {
                        throw zzn("Unterminated object");
                    }
                    this.zza = 2;
                    return 2;
                }
                int zzm3 = zzm(true);
                if (zzm3 == 34) {
                    this.zza = 13;
                    return 13;
                }
                if (zzm3 == 39) {
                    throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (zzm3 != 125) {
                    throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (i14 == 5) {
                    throw zzn("Expected name");
                }
                this.zza = 2;
                return 2;
            }
            if (i14 == 4) {
                iArr[i13] = 5;
                int zzm4 = zzm(true);
                if (zzm4 != 58) {
                    if (zzm4 != 61) {
                        throw zzn("Expected ':'");
                    }
                    throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            } else if (i14 == 6) {
                iArr[i13] = 7;
            } else {
                if (i14 == 7) {
                    if (zzm(false) != -1) {
                        throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                    this.zza = 17;
                    return 17;
                }
                if (i14 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int zzm5 = zzm(true);
        if (zzm5 == 34) {
            this.zza = 9;
            return 9;
        }
        if (zzm5 == 39) {
            throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
        if (zzm5 == 44 || zzm5 == 59) {
            i7 = 1;
            str = "Use JsonReader.setLenient(true) to accept malformed JSON";
        } else {
            if (zzm5 == 91) {
                this.zza = 3;
                return 3;
            }
            if (zzm5 == 93) {
                i7 = 1;
                str = "Use JsonReader.setLenient(true) to accept malformed JSON";
                if (i14 == 1) {
                    this.zza = 4;
                    return 4;
                }
            } else {
                if (zzm5 == 123) {
                    this.zza = 1;
                    return 1;
                }
                int i15 = this.zzd - 1;
                this.zzd = i15;
                char c12 = this.zzc[i15];
                if (c12 == 't' || c12 == 'T') {
                    str2 = "true";
                    str3 = "TRUE";
                    i10 = 5;
                } else if (c12 == 'f' || c12 == 'F') {
                    str2 = "false";
                    str3 = "FALSE";
                    i10 = 6;
                } else if (c12 == 'n' || c12 == 'N') {
                    str2 = "null";
                    str3 = "NULL";
                    i10 = 7;
                } else {
                    i10 = 0;
                    if (i10 == 0) {
                        return i10;
                    }
                    char[] cArr = this.zzc;
                    int i16 = this.zzd;
                    int i17 = this.zze;
                    boolean z10 = true;
                    int i18 = 0;
                    char c13 = 0;
                    boolean z11 = false;
                    long j = 0;
                    while (true) {
                        if (i16 + i18 == i17) {
                            if (i18 == 1024) {
                                break;
                            }
                            if (!zzr(i18 + 1)) {
                                break;
                            }
                            i16 = this.zzd;
                            i17 = this.zze;
                        }
                        char c14 = cArr[i16 + i18];
                        if (c14 != '+') {
                            if (c14 == 'E' || c14 == 'e') {
                                i11 = i17;
                                c11 = 6;
                                if (c13 != 2 && c13 != 4) {
                                    break;
                                }
                                c13 = 5;
                                i18++;
                                i17 = i11;
                                z8 = true;
                            } else if (c14 == '-') {
                                i11 = i17;
                                c11 = 6;
                                if (c13 == 0) {
                                    c13 = 1;
                                    z11 = true;
                                    i18++;
                                    i17 = i11;
                                    z8 = true;
                                } else {
                                    if (c13 != 5) {
                                        break;
                                    }
                                    c13 = c11;
                                    i18++;
                                    i17 = i11;
                                    z8 = true;
                                }
                            } else if (c14 == '.') {
                                i11 = i17;
                                c11 = 6;
                                if (c13 != 2) {
                                    break;
                                }
                                c13 = 3;
                                i18++;
                                i17 = i11;
                                z8 = true;
                            } else {
                                if (c14 < '0' || c14 > '9') {
                                    break;
                                }
                                if (c13 == z8 || c13 == 0) {
                                    i11 = i17;
                                    c11 = 6;
                                    j = -(c14 - '0');
                                    c13 = 2;
                                } else if (c13 != 2) {
                                    i11 = i17;
                                    c11 = 6;
                                    if (c13 == 3) {
                                        c13 = 4;
                                    } else if (c13 == 5 || c13 == 6) {
                                        c13 = 7;
                                    }
                                    i18++;
                                    i17 = i11;
                                    z8 = true;
                                } else {
                                    if (j == 0) {
                                        break;
                                    }
                                    i11 = i17;
                                    long j10 = (10 * j) - (c14 - '0');
                                    z10 &= j > -922337203685477580L || (j == -922337203685477580L && j10 < j);
                                    j = j10;
                                    c11 = 6;
                                }
                                i18++;
                                i17 = i11;
                                z8 = true;
                            }
                            if (i12 == 0) {
                                return i12;
                            }
                            if (zzs(this.zzc[this.zzd])) {
                                throw zzn("Use JsonReader.setLenient(true) to accept malformed JSON");
                            }
                            throw zzn("Expected value");
                        }
                        i11 = i17;
                        c11 = 6;
                        if (c13 != 5) {
                            break;
                        }
                        c13 = c11;
                        i18++;
                        i17 = i11;
                        z8 = true;
                    }
                    i12 = 0;
                    if (i12 == 0) {
                    }
                }
                int length = str2.length();
                int i19 = 1;
                while (true) {
                    if (i19 < length) {
                        if ((this.zzd + i19 >= this.zze && !zzr(i19 + 1)) || ((c10 = this.zzc[this.zzd + i19]) != str2.charAt(i19) && c10 != str3.charAt(i19))) {
                            break;
                        }
                        i19++;
                    } else if ((this.zzd + length >= this.zze && !zzr(length + 1)) || !zzs(this.zzc[this.zzd + length])) {
                        this.zzd += length;
                        this.zza = i10;
                    }
                }
                i10 = 0;
                if (i10 == 0) {
                }
            }
        }
        if (i14 == i7 || i14 == 2) {
            throw zzn(str);
        }
        throw zzn("Unexpected value");
    }

    public final String zzb() {
        int i7 = this.zzf;
        int i10 = this.zzd;
        int i11 = this.zzg;
        StringBuilder sb2 = new StringBuilder(" at line ");
        sb2.append(i7 + 1);
        sb2.append(" column ");
        sb2.append((i10 - i11) + 1);
        sb2.append(" path ");
        StringBuilder sb3 = new StringBuilder("$");
        for (int i12 = 0; i12 < this.zzk; i12++) {
            int i13 = this.zzj[i12];
            if (i13 == 1 || i13 == 2) {
                int i14 = this.zzm[i12];
                sb3.append('[');
                sb3.append(i14);
                sb3.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb3.append('.');
                String str = this.zzl[i12];
                if (str != null) {
                    sb3.append(str);
                }
            }
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public final String zzc() {
        String zzo;
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        if (i7 == 14) {
            zzo = zzp();
        } else if (i7 == 12) {
            zzo = zzo('\'');
        } else {
            if (i7 != 13) {
                throw new IllegalStateException("Expected a name but was " + ((Object) zzabd.zza(zzl())) + zzb());
            }
            zzo = zzo('\"');
        }
        this.zza = 0;
        this.zzl[this.zzk - 1] = zzo;
        return zzo;
    }

    public final String zzd() {
        String str;
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        if (i7 == 10) {
            str = zzp();
        } else if (i7 == 8) {
            str = zzo('\'');
        } else if (i7 == 9) {
            str = zzo('\"');
        } else if (i7 == 11) {
            str = null;
        } else if (i7 == 15) {
            str = Long.toString(this.zzh);
        } else {
            if (i7 != 16) {
                throw new IllegalStateException("Expected a string but was " + ((Object) zzabd.zza(zzl())) + zzb());
            }
            str = new String(this.zzc, this.zzd, this.zzi);
            this.zzd += this.zzi;
        }
        this.zza = 0;
        int[] iArr = this.zzm;
        int i10 = this.zzk - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final void zze() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        if (i7 == 3) {
            zzq(1);
            this.zzm[this.zzk - 1] = 0;
            this.zza = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ((Object) zzabd.zza(zzl())) + zzb());
        }
    }

    public final void zzf() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        if (i7 == 1) {
            zzq(3);
            this.zza = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ((Object) zzabd.zza(zzl())) + zzb());
        }
    }

    public final void zzg() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        if (i7 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + ((Object) zzabd.zza(zzl())) + zzb());
        }
        int i10 = this.zzk;
        this.zzk = i10 - 1;
        int[] iArr = this.zzm;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.zza = 0;
    }

    public final void zzh() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        if (i7 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + ((Object) zzabd.zza(zzl())) + zzb());
        }
        int i10 = this.zzk;
        int i11 = i10 - 1;
        this.zzk = i11;
        this.zzl[i11] = null;
        int[] iArr = this.zzm;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.zza = 0;
    }

    public final void zzi() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        if (i7 != 7) {
            throw new IllegalStateException("Expected null but was " + ((Object) zzabd.zza(zzl())) + zzb());
        }
        this.zza = 0;
        int[] iArr = this.zzm;
        int i10 = this.zzk - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final boolean zzj() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        return (i7 == 2 || i7 == 4 || i7 == 17) ? false : true;
    }

    public final boolean zzk() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        if (i7 == 5) {
            this.zza = 0;
            int[] iArr = this.zzm;
            int i10 = this.zzk - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i7 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + ((Object) zzabd.zza(zzl())) + zzb());
        }
        this.zza = 0;
        int[] iArr2 = this.zzm;
        int i11 = this.zzk - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final int zzl() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zza();
        }
        switch (i7) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
