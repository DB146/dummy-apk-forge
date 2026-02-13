package A0;

import N6.AbstractC0452z;
import N6.C0450x;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import j5.C1380c;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import k5.C1427f;
import l5.C1499m;
import y7.C2414F;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11a;

    public /* synthetic */ B(int i7) {
        this.f11a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7 = 17;
        int i10 = 18;
        switch (this.f11a) {
            case 0:
                L l10 = (L) obj;
                L l11 = (L) obj2;
                float f4 = l10.f61T.f105p.f185R;
                float f10 = l11.f61T.f105p.f185R;
                return f4 == f10 ? kotlin.jvm.internal.l.f(l10.u(), l11.u()) : Float.compare(f4, f10);
            case 1:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 2:
                String name = ((File) obj).getName();
                int i11 = B7.b.f2202f;
                return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
            case 3:
                return kotlin.jvm.internal.l.f(((E.t) obj).f3483a, ((E.t) obj2).f3483a);
            case 4:
                Db.j jVar = (Db.j) obj;
                Db.j jVar2 = (Db.j) obj2;
                return (((Number) jVar.f3355b).intValue() - ((Number) jVar.f3354a).intValue()) - (((Number) jVar2.f3355b).intValue() - ((Number) jVar2.f3354a).intValue());
            case 5:
                return kotlin.jvm.internal.l.f(((Q.L) obj).f8325b, ((Q.L) obj2).f8325b);
            case 6:
                T4.b bVar = (T4.b) obj;
                T4.b bVar2 = (T4.b) obj2;
                int compare = Integer.compare(bVar.f9245c, bVar2.f9245c);
                return compare != 0 ? compare : bVar.f9244b.compareTo(bVar2.f9244b);
            case 7:
                return W4.k.b(((W4.j) obj).f10714a.f10710c, ((W4.j) obj2).f10714a.f10710c);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return Integer.compare(((b5.d) obj2).f13922b, ((b5.d) obj).f13922b);
            case 9:
                return Integer.compare(((j5.d) obj).f18624a.f18627b, ((j5.d) obj2).f18624a.f18627b);
            case 10:
                return Long.compare(((C1380c) obj).f18621b, ((C1380c) obj2).f18621b);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return ((m4.L) obj2).f20092v - ((m4.L) obj).f20092v;
            case 12:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 13:
                N6.s0 s0Var = k5.q.j;
                return 0;
            case 14:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0450x.f(k5.p.d((k5.p) Collections.max(list, new B(i7)), (k5.p) Collections.max(list2, new B(i7)))).a(list.size(), list2.size()).b((k5.p) Collections.max(list, new B(i10)), (k5.p) Collections.max(list2, new B(i10)), new B(i10)).e();
            case 15:
                return ((C1427f) Collections.max((List) obj)).compareTo((C1427f) Collections.max((List) obj2));
            case 16:
                return ((k5.m) ((List) obj).get(0)).compareTo((k5.m) ((List) obj2).get(0));
            case 17:
                return k5.p.d((k5.p) obj, (k5.p) obj2);
            case 18:
                k5.p pVar = (k5.p) obj;
                k5.p pVar2 = (k5.p) obj2;
                N6.s0 a9 = (pVar.f18947e && pVar.f18950v) ? k5.q.j : k5.q.j.a();
                C0450x c0450x = AbstractC0452z.f7375a;
                int i12 = pVar.f18951w;
                return c0450x.b(Integer.valueOf(i12), Integer.valueOf(pVar2.f18951w), pVar.f18948f.f19002K ? k5.q.j.a() : k5.q.k).b(Integer.valueOf(pVar.f18952x), Integer.valueOf(pVar2.f18952x), a9).b(Integer.valueOf(i12), Integer.valueOf(pVar2.f18951w), a9).e();
            case 19:
                C1499m c1499m = (C1499m) obj;
                C1499m c1499m2 = (C1499m) obj2;
                int compare2 = Integer.compare(c1499m2.f19528b, c1499m.f19528b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo = c1499m.f19529c.compareTo(c1499m2.f19529c);
                return compareTo != 0 ? compareTo : c1499m.f19530d.compareTo(c1499m2.f19530d);
            case 20:
                C1499m c1499m3 = (C1499m) obj;
                C1499m c1499m4 = (C1499m) obj2;
                int compare3 = Integer.compare(c1499m4.f19527a, c1499m3.f19527a);
                if (compare3 != 0) {
                    return compare3;
                }
                int compareTo2 = c1499m4.f19529c.compareTo(c1499m3.f19529c);
                return compareTo2 != 0 ? compareTo2 : c1499m4.f19530d.compareTo(c1499m3.f19530d);
            case 21:
                return ((m5.P) obj).f20568a - ((m5.P) obj2).f20568a;
            case 22:
                return Float.compare(((m5.P) obj).f20570c, ((m5.P) obj2).f20570c);
            case 23:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i13 = 0; i13 < bArr.length; i13++) {
                    byte b2 = bArr[i13];
                    byte b10 = bArr2[i13];
                    if (b2 != b10) {
                        return b2 - b10;
                    }
                }
                return 0;
            case 24:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return ((C2414F) ((y7.r0) obj)).f27119a.compareTo(((C2414F) ((y7.r0) obj2)).f27119a);
            case 26:
                String str = (String) obj;
                String str2 = (String) obj2;
                kotlin.jvm.internal.l.b(str2);
                Locale locale = Locale.ROOT;
                String lowerCase = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
                if (ac.g.b0(lowerCase, "c1")) {
                    return 1;
                }
                String lowerCase2 = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase2, "toLowerCase(...)");
                if (ac.g.b0(lowerCase2, "euro")) {
                    return 1;
                }
                String lowerCase3 = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase3, "toLowerCase(...)");
                if (ac.g.b0(lowerCase3, "epl")) {
                    return 1;
                }
                String lowerCase4 = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase4, "toLowerCase(...)");
                if (ac.g.b0(lowerCase4, "laliga")) {
                    return 1;
                }
                String lowerCase5 = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase5, "toLowerCase(...)");
                if (ac.g.b0(lowerCase5, "premier")) {
                    String lowerCase6 = str2.toLowerCase(locale);
                    kotlin.jvm.internal.l.d(lowerCase6, "toLowerCase(...)");
                    if (ac.g.b0(lowerCase6, "league")) {
                        return 1;
                    }
                }
                String lowerCase7 = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase7, "toLowerCase(...)");
                if (ac.g.b0(lowerCase7, "nba")) {
                    return 1;
                }
                String lowerCase8 = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase8, "toLowerCase(...)");
                if (ac.g.b0(lowerCase8, "uefa")) {
                    return 1;
                }
                String lowerCase9 = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase9, "toLowerCase(...)");
                if (ac.g.b0(lowerCase9, "european")) {
                    return 1;
                }
                String lowerCase10 = str2.toLowerCase(locale);
                kotlin.jvm.internal.l.d(lowerCase10, "toLowerCase(...)");
                if (ac.g.b0(lowerCase10, "ngoại")) {
                    String lowerCase11 = str2.toLowerCase(locale);
                    kotlin.jvm.internal.l.d(lowerCase11, "toLowerCase(...)");
                    if (ac.g.b0(lowerCase11, "hạng")) {
                        String lowerCase12 = str2.toLowerCase(locale);
                        kotlin.jvm.internal.l.d(lowerCase12, "toLowerCase(...)");
                        if (ac.g.b0(lowerCase12, "anh")) {
                            return 1;
                        }
                    }
                }
                return str.compareTo(str2);
            default:
                return ((String) obj2).length() - ((String) obj).length();
        }
    }
}
