package w1;

import A9.O;
import android.text.SpannableStringBuilder;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2198b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f25644b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f25645c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2198b f25646d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2198b f25647e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25648a;

    static {
        O o10 = AbstractC2202f.f25656c;
        f25644b = Character.toString((char) 8206);
        f25645c = Character.toString((char) 8207);
        f25646d = new C2198b(false);
        f25647e = new C2198b(true);
    }

    public C2198b(boolean z8) {
        O o10 = AbstractC2202f.f25654a;
        this.f25648a = z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0079, code lost:
    
        if (r0.f25642c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        C2197a c2197a = new C2197a(charSequence);
        c2197a.f25642c = 0;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = c2197a.f25642c;
            if (i12 < c2197a.f25641b && i7 == 0) {
                CharSequence charSequence2 = c2197a.f25640a;
                char charAt = charSequence2.charAt(i12);
                c2197a.f25643d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, c2197a.f25642c);
                    c2197a.f25642c = Character.charCount(codePointAt) + c2197a.f25642c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    c2197a.f25642c++;
                    char c10 = c2197a.f25643d;
                    directionality = c10 < 1792 ? C2197a.f25639e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i11 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i11++;
                                i10 = -1;
                                continue;
                            case 16:
                            case 17:
                                i11++;
                                i10 = 1;
                                continue;
                            case 18:
                                i11--;
                                i10 = 0;
                                continue;
                        }
                    }
                } else if (i11 == 0) {
                }
                i7 = i11;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0021. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        C2197a c2197a = new C2197a(charSequence);
        c2197a.f25642c = c2197a.f25641b;
        int i7 = 0;
        while (true) {
            int i10 = i7;
            while (c2197a.f25642c > 0) {
                byte a9 = c2197a.a();
                if (a9 != 0) {
                    if (a9 == 1 || a9 == 2) {
                        if (i7 != 0) {
                            if (i10 == 0) {
                                break;
                            }
                        }
                    } else if (a9 != 9) {
                        switch (a9) {
                            case 14:
                            case 15:
                                if (i10 == i7) {
                                    break;
                                }
                                i7--;
                                break;
                            case 16:
                            case 17:
                                if (i10 == i7) {
                                    break;
                                }
                                i7--;
                                break;
                            case 18:
                                i7++;
                                break;
                            default:
                                if (i10 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i7 != 0) {
                    if (i10 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
        return -1;
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        O o10 = AbstractC2202f.f25656c;
        if (charSequence == null) {
            return null;
        }
        boolean f4 = o10.f(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean f10 = (f4 ? AbstractC2202f.f25655b : AbstractC2202f.f25654a).f(charSequence, charSequence.length());
        String str = "";
        String str2 = f25645c;
        String str3 = f25644b;
        boolean z8 = this.f25648a;
        spannableStringBuilder.append((CharSequence) ((z8 || !(f10 || a(charSequence) == 1)) ? (!z8 || (f10 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (f4 != z8) {
            spannableStringBuilder.append(f4 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean f11 = (f4 ? AbstractC2202f.f25655b : AbstractC2202f.f25654a).f(charSequence, charSequence.length());
        if (!z8 && (f11 || b(charSequence) == 1)) {
            str = str3;
        } else if (z8 && (!f11 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
