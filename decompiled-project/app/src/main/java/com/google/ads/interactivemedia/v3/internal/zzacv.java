package com.google.ads.interactivemedia.v3.internal;

import P1.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import h3.o;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import y.S;

/* loaded from: classes.dex */
public final class zzacv implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private String zzk;
    private int[] zzl;
    private String[] zzn;
    private int[] zzo;
    private boolean zzc = false;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzm = 1;

    static {
        zzyp.zza = new zzacu();
    }

    public zzacv(Reader reader) {
        int[] iArr = new int[32];
        this.zzl = iArr;
        iArr[0] = 6;
        this.zzn = new String[32];
        this.zzo = new int[32];
        this.zzb = reader;
    }

    private final void zzA() {
        if (!this.zzc) {
            throw zzw("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private final void zzB(int i7) {
        int i10 = this.zzm;
        int[] iArr = this.zzl;
        if (i10 == iArr.length) {
            int i11 = i10 + i10;
            this.zzl = Arrays.copyOf(iArr, i11);
            this.zzo = Arrays.copyOf(this.zzo, i11);
            this.zzn = (String[]) Arrays.copyOf(this.zzn, i11);
        }
        int[] iArr2 = this.zzl;
        int i12 = this.zzm;
        this.zzm = i12 + 1;
        iArr2[i12] = i7;
    }

    private final void zzC(char c10) {
        char[] cArr = this.zzd;
        do {
            int i7 = this.zze;
            int i10 = this.zzf;
            while (i7 < i10) {
                int i11 = i7 + 1;
                char c11 = cArr[i7];
                if (c11 == c10) {
                    this.zze = i11;
                    return;
                }
                if (c11 == '\\') {
                    this.zze = i11;
                    zzu();
                    i7 = this.zze;
                    i10 = this.zzf;
                } else {
                    if (c11 == '\n') {
                        this.zzg++;
                        this.zzh = i11;
                    }
                    i7 = i11;
                }
            }
            this.zze = i7;
        } while (zzF(1));
        throw zzw("Unterminated string");
    }

    private final void zzD() {
        char c10;
        do {
            if (this.zze >= this.zzf && !zzF(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i7 = this.zze;
            int i10 = i7 + 1;
            this.zze = i10;
            c10 = cArr[i7];
            if (c10 == '\n') {
                this.zzg++;
                this.zzh = i10;
                return;
            }
        } while (c10 != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private final void zzE() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r4.zze
            int r2 = r2 + r1
            int r3 = r4.zzf
            if (r2 >= r3) goto L50
            char[] r3 = r4.zzd
            char r2 = r3[r2]
            r3 = 9
            if (r2 == r3) goto L4a
            r3 = 10
            if (r2 == r3) goto L4a
            r3 = 12
            if (r2 == r3) goto L4a
            r3 = 13
            if (r2 == r3) goto L4a
            r3 = 32
            if (r2 == r3) goto L4a
            r3 = 35
            if (r2 == r3) goto L47
            r3 = 44
            if (r2 == r3) goto L4a
            r3 = 47
            if (r2 == r3) goto L47
            r3 = 61
            if (r2 == r3) goto L47
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L4a
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto L4a
            r3 = 58
            if (r2 == r3) goto L4a
            r3 = 59
            if (r2 == r3) goto L47
            switch(r2) {
                case 91: goto L4a;
                case 92: goto L47;
                case 93: goto L4a;
                default: goto L44;
            }
        L44:
            int r1 = r1 + 1
            goto L2
        L47:
            r4.zzA()
        L4a:
            int r0 = r4.zze
            int r0 = r0 + r1
            r4.zze = r0
            return
        L50:
            r4.zze = r2
            r1 = 1
            boolean r1 = r4.zzF(r1)
            if (r1 == 0) goto L5a
            goto L1
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzacv.zzE():void");
    }

    private final boolean zzF(int i7) {
        int i10;
        char[] cArr = this.zzd;
        int i11 = this.zzh;
        int i12 = this.zze;
        this.zzh = i11 - i12;
        int i13 = this.zzf;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.zzf = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i15 = this.zzf;
            int read = reader.read(cArr, i15, 1024 - i15);
            if (read == -1) {
                return false;
            }
            i10 = this.zzf + read;
            this.zzf = i10;
            if (this.zzg == 0 && this.zzh == 0 && i10 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i7++;
            }
        } while (i10 < i7);
        return true;
    }

    private final boolean zzG(char c10) {
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
        zzA();
        return false;
    }

    private final char zzu() {
        int i7;
        if (this.zze == this.zzf && !zzF(1)) {
            throw zzw("Unterminated escape sequence");
        }
        char[] cArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        char c10 = cArr[i10];
        if (c10 == '\n') {
            this.zzg++;
            this.zzh = i11;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                throw zzw("Invalid escape sequence");
            }
            if (i10 + 5 > this.zzf && !zzF(4)) {
                throw zzw("Unterminated escape sequence");
            }
            int i12 = this.zze;
            int i13 = i12 + 4;
            char c11 = 0;
            while (i12 < i13) {
                char[] cArr2 = this.zzd;
                char c12 = cArr2[i12];
                char c13 = (char) (c11 << 4);
                if (c12 >= '0' && c12 <= '9') {
                    i7 = c12 - '0';
                } else if (c12 >= 'a' && c12 <= 'f') {
                    i7 = c12 - 'W';
                } else {
                    if (c12 < 'A' || c12 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr2, this.zze, 4)));
                    }
                    i7 = c12 - '7';
                }
                c11 = (char) (i7 + c13);
                i12++;
            }
            this.zze += 4;
            return c11;
        }
        return c10;
    }

    private final int zzv(boolean z8) {
        int i7;
        char[] cArr = this.zzd;
        int i10 = this.zze;
        int i11 = this.zzf;
        while (true) {
            if (i10 == i11) {
                this.zze = i10;
                if (!zzF(1)) {
                    if (z8) {
                        throw new EOFException("End of input".concat(zzg()));
                    }
                    return -1;
                }
                i10 = this.zze;
                i11 = this.zzf;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.zzg++;
                this.zzh = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.zze = i12;
                    if (i12 == i11) {
                        this.zze = i10;
                        boolean zzF = zzF(2);
                        this.zze++;
                        if (!zzF) {
                            return 47;
                        }
                    }
                    zzA();
                    int i13 = this.zze;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.zze = i13 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzF(2)) {
                                throw zzw("Unterminated comment");
                            }
                            char[] cArr2 = this.zzd;
                            int i14 = this.zze;
                            if (cArr2[i14] != '\n') {
                                while (i7 < 2) {
                                    i7 = this.zzd[this.zze + i7] == "*/".charAt(i7) ? i7 + 1 : 0;
                                }
                                i10 = this.zze + 2;
                                i11 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i14 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c11 != '/') {
                            return 47;
                        }
                        this.zze = i13 + 1;
                        zzD();
                        i10 = this.zze;
                        i11 = this.zzf;
                    }
                } else {
                    if (c10 != '#') {
                        this.zze = i12;
                        return c10;
                    }
                    this.zze = i12;
                    zzA();
                    zzD();
                    i10 = this.zze;
                    i11 = this.zzf;
                }
            }
            i10 = i12;
        }
    }

    private final IOException zzw(String str) {
        throw new zzacy(str.concat(zzg()));
    }

    private final String zzx(boolean z8) {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i10 = this.zzm;
            if (i7 >= i10) {
                return sb2.toString();
            }
            int i11 = this.zzl[i7];
            if (i11 == 1 || i11 == 2) {
                int i12 = this.zzo[i7];
                if (z8 && i12 > 0 && i7 == i10 - 1) {
                    i12--;
                }
                sb2.append('[');
                sb2.append(i12);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = this.zzn[i7];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i7++;
        }
    }

    private final String zzy(char c10) {
        char[] cArr = this.zzd;
        StringBuilder sb2 = null;
        do {
            int i7 = this.zze;
            int i10 = this.zzf;
            int i11 = i7;
            while (i7 < i10) {
                int i12 = i7 + 1;
                char c11 = cArr[i7];
                if (c11 == c10) {
                    this.zze = i12;
                    int i13 = (i12 - i11) - 1;
                    if (sb2 == null) {
                        return new String(cArr, i11, i13);
                    }
                    sb2.append(cArr, i11, i13);
                    return sb2.toString();
                }
                if (c11 == '\\') {
                    this.zze = i12;
                    int i14 = i12 - i11;
                    int i15 = i14 - 1;
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i14 + i14, 16));
                    }
                    sb2.append(cArr, i11, i15);
                    sb2.append(zzu());
                    i11 = this.zze;
                    i10 = this.zzf;
                    i7 = i11;
                } else {
                    if (c11 == '\n') {
                        this.zzg++;
                        this.zzh = i12;
                    }
                    i7 = i12;
                }
            }
            if (sb2 == null) {
                int i16 = i7 - i11;
                sb2 = new StringBuilder(Math.max(i16 + i16, 16));
            }
            sb2.append(cArr, i11, i7 - i11);
            this.zze = i7;
        } while (zzF(1));
        throw zzw("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        zzA();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzz() {
        String sb2;
        int i7 = 0;
        StringBuilder sb3 = null;
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.zze + i10;
                if (i11 < this.zzf) {
                    char c10 = this.zzd[i11];
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
                    sb3.append(this.zzd, this.zze, i10);
                    this.zze += i10;
                } else if (zzF(i10 + 1)) {
                }
            }
            i7 = i10;
            if (sb3 != null) {
                sb2 = new String(this.zzd, this.zze, i7);
            } else {
                sb3.append(this.zzd, this.zze, i7);
                sb2 = sb3.toString();
            }
            this.zze += i7;
            return sb2;
        } while (zzF(1));
        if (sb3 != null) {
        }
        this.zze += i7;
        return sb2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza = 0;
        this.zzl[0] = 8;
        this.zzm = 1;
        this.zzb.close();
    }

    public final String toString() {
        return "zzacv".concat(zzg());
    }

    public final double zza() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 == 15) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i10 = this.zzm - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.zzi;
        }
        if (i7 == 16) {
            char[] cArr = this.zzd;
            int i11 = this.zze;
            int i12 = this.zzj;
            this.zzk = new String(cArr, i11, i12);
            this.zze = i11 + i12;
        } else if (i7 == 8 || i7 == 9) {
            this.zzk = zzy(i7 == 8 ? '\'' : '\"');
        } else if (i7 == 10) {
            this.zzk = zzz();
        } else if (i7 != 11) {
            throw new IllegalStateException(zzacw.zzb(this, "Expected a double but was "));
        }
        this.zza = 11;
        double parseDouble = Double.parseDouble(this.zzk);
        if (!this.zzc && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new zzacy("JSON forbids NaN and infinities: " + parseDouble + zzg());
        }
        this.zzk = null;
        this.zza = 0;
        int[] iArr2 = this.zzo;
        int i13 = this.zzm - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return parseDouble;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0213, code lost:
    
        if (zzG(r1) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a3, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0216, code lost:
    
        if (r6 != 2) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0218, code lost:
    
        if (r15 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021e, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0220, code lost:
    
        if (r16 == 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022d, code lost:
    
        if (r11 != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022f, code lost:
    
        if (r14 != 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0235, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0236, code lost:
    
        r21.zzi = r11;
        r21.zze += r10;
        r14 = 15;
        r21.zza = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0232, code lost:
    
        if (r14 == 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0228, code lost:
    
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0225, code lost:
    
        r1 = 2;
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0242, code lost:
    
        if (r6 == r1) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0245, code lost:
    
        if (r6 == 4) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0248, code lost:
    
        if (r6 != 7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x024a, code lost:
    
        r21.zzj = r10;
        r21.zza = 16;
        r14 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb() {
        int zzv;
        int i7;
        int zzv2;
        String str;
        String str2;
        int i10;
        char c10;
        int i11;
        int i12;
        int[] iArr = this.zzl;
        int i13 = this.zzm - 1;
        int i14 = iArr[i13];
        int i15 = 1;
        if (i14 == 1) {
            iArr[i13] = 2;
        } else if (i14 == 2) {
            int zzv3 = zzv(true);
            if (zzv3 != 44) {
                if (zzv3 != 59) {
                    if (zzv3 != 93) {
                        throw zzw("Unterminated array");
                    }
                    this.zza = 4;
                    return 4;
                }
                zzA();
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13] = 4;
                if (i14 == 5 && (zzv = zzv(true)) != 44) {
                    if (zzv != 59) {
                        if (zzv != 125) {
                            throw zzw("Unterminated object");
                        }
                        this.zza = 2;
                        return 2;
                    }
                    zzA();
                }
                int zzv4 = zzv(true);
                if (zzv4 == 34) {
                    this.zza = 13;
                    return 13;
                }
                if (zzv4 == 39) {
                    zzA();
                    this.zza = 12;
                    return 12;
                }
                if (zzv4 == 125) {
                    if (i14 == 5) {
                        throw zzw("Expected name");
                    }
                    this.zza = 2;
                    return 2;
                }
                zzA();
                this.zze--;
                if (!zzG((char) zzv4)) {
                    throw zzw("Expected name");
                }
                this.zza = 14;
                return 14;
            }
            if (i14 == 4) {
                iArr[i13] = 5;
                int zzv5 = zzv(true);
                if (zzv5 != 58) {
                    if (zzv5 != 61) {
                        throw zzw("Expected ':'");
                    }
                    zzA();
                    if (this.zze < this.zzf || zzF(1)) {
                        char[] cArr = this.zzd;
                        int i16 = this.zze;
                        if (cArr[i16] == '>') {
                            this.zze = i16 + 1;
                        }
                    }
                }
            } else {
                if (i14 != 6) {
                    if (i14 == 7) {
                        i7 = 0;
                        if (zzv(false) == -1) {
                            this.zza = 17;
                            return 17;
                        }
                        zzA();
                        this.zze--;
                    } else {
                        i7 = 0;
                        if (i14 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                    zzv2 = zzv(true);
                    if (zzv2 != 34) {
                        this.zza = 9;
                        return 9;
                    }
                    if (zzv2 == 39) {
                        zzA();
                        this.zza = 8;
                        return 8;
                    }
                    if (zzv2 != 44 && zzv2 != 59) {
                        if (zzv2 == 91) {
                            this.zza = 3;
                            return 3;
                        }
                        if (zzv2 != 93) {
                            if (zzv2 == 123) {
                                this.zza = 1;
                                return 1;
                            }
                            int i17 = this.zze - 1;
                            this.zze = i17;
                            char c11 = this.zzd[i17];
                            if (c11 == 't' || c11 == 'T') {
                                str = "TRUE";
                                str2 = "true";
                                i10 = 5;
                            } else if (c11 == 'f' || c11 == 'F') {
                                str = "FALSE";
                                str2 = "false";
                                i10 = 6;
                            } else {
                                if (c11 == 'n' || c11 == 'N') {
                                    str = "NULL";
                                    str2 = "null";
                                    i10 = 7;
                                }
                                i10 = i7;
                                if (i10 == 0) {
                                    return i10;
                                }
                                char[] cArr2 = this.zzd;
                                int i18 = this.zze;
                                int i19 = this.zzf;
                                long j = 0;
                                int i20 = i7;
                                int i21 = i20;
                                int i22 = i21;
                                long j10 = 0;
                                boolean z8 = true;
                                while (true) {
                                    if (i18 + i21 == i19) {
                                        if (i21 == 1024) {
                                            break;
                                        }
                                        if (!zzF(i21 + 1)) {
                                            break;
                                        }
                                        int i23 = this.zze;
                                        i19 = this.zzf;
                                        i18 = i23;
                                    }
                                    char c12 = cArr2[i18 + i21];
                                    if (c12 != '+') {
                                        if (c12 == 'E' || c12 == 'e') {
                                            if (i20 != 2 && i20 != 4) {
                                                break;
                                            }
                                            i20 = 5;
                                            i21++;
                                        } else if (c12 == '-') {
                                            i11 = 6;
                                            if (i20 == 0) {
                                                i20 = 1;
                                                i22 = 1;
                                                i21++;
                                            } else {
                                                if (i20 != 5) {
                                                    break;
                                                }
                                                i20 = i11;
                                                i21++;
                                            }
                                        } else if (c12 == '.') {
                                            if (i20 != 2) {
                                                break;
                                            }
                                            i20 = 3;
                                            i21++;
                                        } else {
                                            if (c12 < '0' || c12 > '9') {
                                                break;
                                            }
                                            if (i20 == 1 || i20 == 0) {
                                                j10 = -(c12 - '0');
                                                i20 = 2;
                                            } else if (i20 == 2) {
                                                if (j10 == j) {
                                                    break;
                                                }
                                                long j11 = (10 * j10) - (c12 - '0');
                                                z8 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                j10 = j11;
                                            } else if (i20 == 3) {
                                                i20 = 4;
                                            } else if (i20 == 5 || i20 == 6) {
                                                i20 = 7;
                                            }
                                            j = 0;
                                            i21++;
                                        }
                                        if (i12 == 0) {
                                            return i12;
                                        }
                                        if (!zzG(this.zzd[this.zze])) {
                                            throw zzw("Expected value");
                                        }
                                        zzA();
                                        this.zza = 10;
                                        return 10;
                                    }
                                    i11 = 6;
                                    if (i20 != 5) {
                                        break;
                                    }
                                    i20 = i11;
                                    i21++;
                                }
                                i12 = 0;
                                if (i12 == 0) {
                                }
                            }
                            int i24 = 1;
                            while (true) {
                                int length = str2.length();
                                if (i24 < length) {
                                    if ((this.zze + i24 >= this.zzf && !zzF(i24 + 1)) || ((c10 = this.zzd[this.zze + i24]) != str2.charAt(i24) && c10 != str.charAt(i24))) {
                                        break;
                                    }
                                    i24++;
                                } else if ((this.zze + length >= this.zzf && !zzF(length + 1)) || !zzG(this.zzd[this.zze + length])) {
                                    this.zze += length;
                                    this.zza = i10;
                                }
                            }
                            i10 = i7;
                            if (i10 == 0) {
                            }
                        } else if (i14 == 1) {
                            this.zza = 4;
                            return 4;
                        }
                    }
                    if (i14 != 1 && i14 != 2) {
                        throw zzw("Unexpected value");
                    }
                    zzA();
                    this.zze--;
                    this.zza = 7;
                    return 7;
                }
                if (this.zzc) {
                    zzv(true);
                    int i25 = this.zze;
                    this.zze = i25 - 1;
                    if (i25 + 4 <= this.zzf || zzF(5)) {
                        int i26 = this.zze;
                        char[] cArr3 = this.zzd;
                        if (cArr3[i26] == ')' && cArr3[i26 + 1] == ']' && cArr3[i26 + 2] == '}' && cArr3[i26 + 3] == '\'' && cArr3[i26 + 4] == '\n') {
                            this.zze = i26 + 5;
                        }
                    }
                }
                this.zzl[this.zzm - 1] = 7;
            }
        }
        i7 = 0;
        zzv2 = zzv(true);
        if (zzv2 != 34) {
        }
    }

    public final int zzc() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 == 15) {
            long j = this.zzi;
            int i10 = (int) j;
            if (j == i10) {
                this.zza = 0;
                int[] iArr = this.zzo;
                int i11 = this.zzm - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + j + zzg());
        }
        if (i7 == 16) {
            char[] cArr = this.zzd;
            int i12 = this.zze;
            int i13 = this.zzj;
            this.zzk = new String(cArr, i12, i13);
            this.zze = i12 + i13;
        } else {
            if (i7 != 8 && i7 != 9 && i7 != 10) {
                throw new IllegalStateException(zzacw.zzb(this, "Expected an int but was "));
            }
            if (i7 == 10) {
                this.zzk = zzz();
            } else {
                this.zzk = zzy(i7 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.zzk);
                this.zza = 0;
                int[] iArr2 = this.zzo;
                int i14 = this.zzm - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.zza = 11;
        double parseDouble = Double.parseDouble(this.zzk);
        int i15 = (int) parseDouble;
        if (i15 != parseDouble) {
            throw new NumberFormatException(S.b("Expected an int but was ", this.zzk, zzg()));
        }
        this.zzk = null;
        this.zza = 0;
        int[] iArr3 = this.zzo;
        int i16 = this.zzm - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    public final long zzd() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 == 15) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i10 = this.zzm - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.zzi;
        }
        if (i7 == 16) {
            char[] cArr = this.zzd;
            int i11 = this.zze;
            int i12 = this.zzj;
            this.zzk = new String(cArr, i11, i12);
            this.zze = i11 + i12;
        } else {
            if (i7 != 8 && i7 != 9 && i7 != 10) {
                throw new IllegalStateException(zzacw.zzb(this, "Expected a long but was "));
            }
            if (i7 == 10) {
                this.zzk = zzz();
            } else {
                this.zzk = zzy(i7 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.zzk);
                this.zza = 0;
                int[] iArr2 = this.zzo;
                int i13 = this.zzm - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.zza = 11;
        double parseDouble = Double.parseDouble(this.zzk);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException(S.b("Expected a long but was ", this.zzk, zzg()));
        }
        this.zzk = null;
        this.zza = 0;
        int[] iArr3 = this.zzo;
        int i14 = this.zzm - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return j;
    }

    public final String zze() {
        return zzx(false);
    }

    public final String zzf() {
        return zzx(true);
    }

    public final String zzg() {
        int i7 = this.zzg + 1;
        int i10 = this.zze - this.zzh;
        String zzx = zzx(false);
        StringBuilder r10 = o.r(i7, " at line ", " column ");
        r10.append(i10 + 1);
        r10.append(" path ");
        r10.append(zzx);
        return r10.toString();
    }

    public final String zzh() {
        String zzy;
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 == 14) {
            zzy = zzz();
        } else if (i7 == 12) {
            zzy = zzy('\'');
        } else {
            if (i7 != 13) {
                throw new IllegalStateException(zzacw.zzb(this, "Expected a name but was "));
            }
            zzy = zzy('\"');
        }
        this.zza = 0;
        this.zzn[this.zzm - 1] = zzy;
        return zzy;
    }

    public final String zzi() {
        String str;
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 == 10) {
            str = zzz();
        } else if (i7 == 8) {
            str = zzy('\'');
        } else if (i7 == 9) {
            str = zzy('\"');
        } else if (i7 == 11) {
            str = this.zzk;
            this.zzk = null;
        } else if (i7 == 15) {
            str = Long.toString(this.zzi);
        } else {
            if (i7 != 16) {
                throw new IllegalStateException(zzacw.zzb(this, "Expected a string but was "));
            }
            str = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
        }
        this.zza = 0;
        int[] iArr = this.zzo;
        int i10 = this.zzm - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final void zzj() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 != 3) {
            throw new IllegalStateException(zzacw.zzb(this, "Expected BEGIN_ARRAY but was "));
        }
        zzB(1);
        this.zzo[this.zzm - 1] = 0;
        this.zza = 0;
    }

    public final void zzk() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 != 1) {
            throw new IllegalStateException(zzacw.zzb(this, "Expected BEGIN_OBJECT but was "));
        }
        zzB(3);
        this.zza = 0;
    }

    public final void zzl() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 != 4) {
            throw new IllegalStateException(zzacw.zzb(this, "Expected END_ARRAY but was "));
        }
        int i10 = this.zzm;
        this.zzm = i10 - 1;
        int[] iArr = this.zzo;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.zza = 0;
    }

    public final void zzm() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 != 2) {
            throw new IllegalStateException(zzacw.zzb(this, "Expected END_OBJECT but was "));
        }
        int i10 = this.zzm;
        int i11 = i10 - 1;
        this.zzm = i11;
        this.zzn[i11] = null;
        int[] iArr = this.zzo;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.zza = 0;
    }

    public final void zzn() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 != 7) {
            throw new IllegalStateException(zzacw.zzb(this, "Expected null but was "));
        }
        this.zza = 0;
        int[] iArr = this.zzo;
        int i10 = this.zzm - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final void zzo(boolean z8) {
        this.zzc = z8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public final void zzp() {
        int i7 = 0;
        do {
            int i10 = this.zza;
            if (i10 == 0) {
                i10 = zzb();
            }
            switch (i10) {
                case 1:
                    zzB(3);
                    i7++;
                    this.zza = 0;
                    break;
                case 2:
                    if (i7 == 0) {
                        this.zzn[this.zzm - 1] = null;
                        i7 = 0;
                    }
                    this.zzm--;
                    i7--;
                    this.zza = 0;
                    break;
                case 3:
                    zzB(1);
                    i7++;
                    this.zza = 0;
                    break;
                case 4:
                    this.zzm--;
                    i7--;
                    this.zza = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                case 15:
                default:
                    this.zza = 0;
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    zzC('\'');
                    this.zza = 0;
                    break;
                case 9:
                    zzC('\"');
                    this.zza = 0;
                    break;
                case 10:
                    zzE();
                    this.zza = 0;
                    break;
                case 12:
                    zzC('\'');
                    if (i7 == 0) {
                        this.zzn[this.zzm - 1] = "<skipped>";
                        i7 = 0;
                    }
                    this.zza = 0;
                    break;
                case 13:
                    zzC('\"');
                    if (i7 == 0) {
                        this.zzn[this.zzm - 1] = "<skipped>";
                        i7 = 0;
                    }
                    this.zza = 0;
                    break;
                case 14:
                    zzE();
                    if (i7 == 0) {
                        this.zzn[this.zzm - 1] = "<skipped>";
                        i7 = 0;
                    }
                    this.zza = 0;
                    break;
                case 16:
                    this.zze += this.zzj;
                    this.zza = 0;
                    break;
                case 17:
                    return;
            }
        } while (i7 > 0);
        int[] iArr = this.zzo;
        int i11 = this.zzm - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final boolean zzq() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        return (i7 == 2 || i7 == 4 || i7 == 17) ? false : true;
    }

    public final boolean zzr() {
        return this.zzc;
    }

    public final boolean zzs() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
        }
        if (i7 == 5) {
            this.zza = 0;
            int[] iArr = this.zzo;
            int i10 = this.zzm - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i7 != 6) {
            throw new IllegalStateException(zzacw.zzb(this, "Expected a boolean but was "));
        }
        this.zza = 0;
        int[] iArr2 = this.zzo;
        int i11 = this.zzm - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final int zzt() {
        int i7 = this.zza;
        if (i7 == 0) {
            i7 = zzb();
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
