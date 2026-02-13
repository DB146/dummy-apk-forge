package ha;

import Db.j;
import Db.o;
import Eb.p;
import ac.n;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import jb.InterfaceC1395f;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class f implements InterfaceC1393d, InterfaceC1395f, InterfaceC1394e {

    /* renamed from: b, reason: collision with root package name */
    public static final f f17908b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f17909c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f17910d = new f(2);

    /* renamed from: e, reason: collision with root package name */
    public static final f f17911e = new f(3);

    /* renamed from: f, reason: collision with root package name */
    public static final f f17912f = new f(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17913a;

    public /* synthetic */ f(int i7) {
        this.f17913a = i7;
    }

    public static int a(String text, String queryNormalize, ArrayList arrayList, int i7) {
        l.e(text, "text");
        l.e(queryNormalize, "queryNormalize");
        String obj = ac.g.v0(text).toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj.toLowerCase(locale);
        l.d(lowerCase, "toLowerCase(...)");
        String replaceVNCharsToLatinChars = StringUtilsKt.replaceVNCharsToLatinChars(lowerCase);
        if (n.T(replaceVNCharsToLatinChars, queryNormalize, true)) {
            return 0;
        }
        if (n.T(replaceVNCharsToLatinChars, UtilsKt.removeAllSpecialChars(queryNormalize), true)) {
            return 1;
        }
        String lowerCase2 = ac.g.v0(text).toString().toLowerCase(locale);
        l.d(lowerCase2, "toLowerCase(...)");
        List r02 = ac.g.r0(StringUtilsKt.replaceVNCharsToLatinChars(lowerCase2), new String[]{" "});
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : r02) {
            if (!ac.g.h0((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.contains(queryNormalize)) {
            i7 -= arrayList.size();
        }
        int size = arrayList.size();
        String str = "";
        int i10 = 0;
        while (i10 < size) {
            String str2 = (String) arrayList.get(i10);
            str = i10 == 0 ? str2 : X.c.i(str, " ", str2);
            int f02 = ac.g.f0(replaceVNCharsToLatinChars, str, 0, 6);
            while (f02 > -1 && str.length() + f02 < replaceVNCharsToLatinChars.length()) {
                i7 -= (f02 == 0 && i10 == 0) ? 3 : 1;
                f02 = ac.g.f0(replaceVNCharsToLatinChars, str, str.length() + f02, 4);
            }
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                if (l.a(arrayList2.get(i11), str2)) {
                    i7 = i11 == i10 ? i7 - 3 : i7 - 1;
                }
                i11++;
            }
            i10++;
        }
        return arrayList2.size() == arrayList.size() ? i7 - 1 : i7;
    }

    public static SpannableString b(String realTitle, ArrayList arrayList) {
        l.e(realTitle, "realTitle");
        SpannableString spannableString = new SpannableString(ac.g.v0(realTitle).toString());
        String lowerCase = ac.g.v0(realTitle).toString().toLowerCase(Locale.ROOT);
        l.d(lowerCase, "toLowerCase(...)");
        String replaceVNCharsToLatinChars = StringUtilsKt.replaceVNCharsToLatinChars(lowerCase);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                if (!ac.g.h0(str) && ac.g.v0(str).toString().length() > 0) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                o oVar = i.f17917e;
                ArrayList arrayList3 = new ArrayList();
                int length = replaceVNCharsToLatinChars.length();
                int i7 = 0;
                int i10 = 0;
                int i11 = -1;
                for (int i12 = 0; i12 < length; i12++) {
                    char charAt = replaceVNCharsToLatinChars.charAt(i12);
                    if (charAt == str2.charAt(i7)) {
                        if (i7 == 0) {
                            i10 = i12;
                        }
                        if (i7 == str2.length() - 1) {
                            i11 = i12;
                        }
                        i7++;
                    } else if (('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || charAt == '+' || charAt == ' ')) {
                        if (charAt != ' ') {
                            if (i7 > 0) {
                                if (charAt == str2.charAt(0)) {
                                    i7 = 1;
                                    i11 = -1;
                                    i10 = i12;
                                }
                            }
                        }
                        i7 = 0;
                        i10 = 0;
                        i11 = -1;
                    }
                    if (i7 >= str2.length()) {
                        if (i11 != -1) {
                            arrayList3.add(new j(Integer.valueOf(i10), Integer.valueOf(i11)));
                        }
                        i7 = 0;
                        i10 = 0;
                        i11 = -1;
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        j jVar = (j) it2.next();
                        int intValue = ((Number) jVar.f3354a).intValue();
                        int intValue2 = ((Number) jVar.f3355b).intValue();
                        o oVar2 = i.f17917e;
                        spannableString.setSpan(new ForegroundColorSpan(((Number) i.f17917e.getValue()).intValue()), intValue, intValue2 + 1, 34);
                    }
                }
            }
        }
        return spannableString;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        Throwable it = (Throwable) obj;
        l.e(it, "it");
        Log.d("Search", "prepareExecute: it");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Comparator] */
    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        String str;
        switch (this.f17913a) {
            case 2:
                List itemList = (List) obj;
                l.e(itemList, "itemList");
                ArrayList arrayList = new ArrayList(p.S(itemList, 10));
                Iterator it = itemList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1267c((W9.c) it.next()));
                }
                return arrayList;
            case 3:
                List it2 = (List) obj;
                l.e(it2, "it");
                List n02 = Eb.o.n0(new Object(), it2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : n02) {
                    e eVar = (e) obj2;
                    if (eVar instanceof C1267c) {
                        str = "Đã xem gần đây";
                    } else if (eVar instanceof d) {
                        str = ((d) eVar).f17903b.g();
                    } else {
                        if (!(eVar instanceof C1266b)) {
                            throw new Db.d(1);
                        }
                        str = ((C1266b) eVar).f17899b.f10234a;
                    }
                    Object obj3 = linkedHashMap.get(str);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(str, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                return linkedHashMap;
            default:
                List it3 = (List) obj;
                l.e(it3, "it");
                return it3.isEmpty() ? gb.p.b(new Throwable("Empty list")) : gb.p.c(it3);
        }
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        List it = (List) obj;
        l.e(it, "it");
        return !it.isEmpty();
    }
}
