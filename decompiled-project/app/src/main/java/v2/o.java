package v2;

import a.AbstractC0672a;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y7.u0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: m, reason: collision with root package name */
    public static final ac.e f24995m = new ac.e("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final ac.e f24996n = new ac.e("\\{(.+?)\\}");

    /* renamed from: o, reason: collision with root package name */
    public static final ac.e f24997o = new ac.e("http[s]?://");

    /* renamed from: p, reason: collision with root package name */
    public static final ac.e f24998p = new ac.e(".*");

    /* renamed from: q, reason: collision with root package name */
    public static final ac.e f24999q = new ac.e("([^/]*?|)");

    /* renamed from: r, reason: collision with root package name */
    public static final ac.e f25000r = new ac.e("^[^?#]+\\?([^#]*).*");

    /* renamed from: a, reason: collision with root package name */
    public final String f25001a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25002b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25003c;

    /* renamed from: d, reason: collision with root package name */
    public final Db.o f25004d;

    /* renamed from: e, reason: collision with root package name */
    public final Db.o f25005e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f25006f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f25007h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f25008i;
    public final Object j;
    public final Db.o k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f25009l;

    public o(String str) {
        this.f25001a = str;
        ArrayList arrayList = new ArrayList();
        this.f25002b = arrayList;
        final int i7 = 0;
        this.f25004d = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: v2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f24990b;

            {
                this.f24990b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v41, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v45, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // Rb.a
            public final Object invoke() {
                List list;
                ?? r12 = 1;
                int i10 = 0;
                o oVar = this.f24990b;
                switch (i7) {
                    case 0:
                        String str2 = oVar.f25003c;
                        if (str2 == null) {
                            return null;
                        }
                        ac.f[] fVarArr = ac.f.f12834a;
                        return new ac.e(str2, 0);
                    case 1:
                        String str3 = oVar.f25001a;
                        return Boolean.valueOf(str3 != null && o.f25000r.d(str3));
                    case 2:
                        oVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f25005e.getValue()).booleanValue()) {
                            String str4 = oVar.f25001a;
                            Uri parse = Uri.parse(str4);
                            kotlin.jvm.internal.l.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > r12) {
                                    throw new IllegalArgumentException(h3.o.n("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Eb.o.Z(queryParameters);
                                if (str6 == null) {
                                    oVar.g = r12;
                                    str6 = str5;
                                }
                                r8.o a9 = ac.e.a(o.f24996n, str6);
                                n nVar = new n();
                                int i11 = i10;
                                int i12 = r12;
                                while (a9 != null) {
                                    ac.d o10 = ((V.k) a9.f23859d).o(i12);
                                    kotlin.jvm.internal.l.b(o10);
                                    nVar.f24994b.add(o10.f12831a);
                                    if (a9.h().f11025a > i11) {
                                        String substring = str6.substring(i11, a9.h().f11025a);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        kotlin.jvm.internal.l.d(quote, "quote(...)");
                                        sb2.append(quote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i11 = a9.h().f11026b + 1;
                                    a9 = a9.m();
                                    i12 = 1;
                                }
                                int i13 = i12;
                                if (i11 < str6.length()) {
                                    String substring2 = str6.substring(i11);
                                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    kotlin.jvm.internal.l.d(quote2, "quote(...)");
                                    sb2.append(quote2);
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                kotlin.jvm.internal.l.d(sb3, "toString(...)");
                                nVar.f24993a = o.g(sb3);
                                linkedHashMap.put(str5, nVar);
                                r12 = i13;
                                i10 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = oVar.f25001a;
                        Uri parse2 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        kotlin.jvm.internal.l.b(fragment);
                        o.a(fragment, arrayList2, sb4);
                        return new Db.j(arrayList2, sb4.toString());
                    case 4:
                        Db.j jVar = (Db.j) oVar.f25007h.getValue();
                        return (jVar == null || (list = (List) jVar.f3354a) == null) ? new ArrayList() : list;
                    case 5:
                        Db.j jVar2 = (Db.j) oVar.f25007h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f3355b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) oVar.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        ac.f[] fVarArr2 = ac.f.f12834a;
                        return new ac.e(str8, 0);
                    default:
                        oVar.getClass();
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f25005e = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: v2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f24990b;

            {
                this.f24990b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v41, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v45, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // Rb.a
            public final Object invoke() {
                List list;
                ?? r12 = 1;
                int i102 = 0;
                o oVar = this.f24990b;
                switch (i10) {
                    case 0:
                        String str2 = oVar.f25003c;
                        if (str2 == null) {
                            return null;
                        }
                        ac.f[] fVarArr = ac.f.f12834a;
                        return new ac.e(str2, 0);
                    case 1:
                        String str3 = oVar.f25001a;
                        return Boolean.valueOf(str3 != null && o.f25000r.d(str3));
                    case 2:
                        oVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f25005e.getValue()).booleanValue()) {
                            String str4 = oVar.f25001a;
                            Uri parse = Uri.parse(str4);
                            kotlin.jvm.internal.l.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > r12) {
                                    throw new IllegalArgumentException(h3.o.n("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Eb.o.Z(queryParameters);
                                if (str6 == null) {
                                    oVar.g = r12;
                                    str6 = str5;
                                }
                                r8.o a9 = ac.e.a(o.f24996n, str6);
                                n nVar = new n();
                                int i11 = i102;
                                int i12 = r12;
                                while (a9 != null) {
                                    ac.d o10 = ((V.k) a9.f23859d).o(i12);
                                    kotlin.jvm.internal.l.b(o10);
                                    nVar.f24994b.add(o10.f12831a);
                                    if (a9.h().f11025a > i11) {
                                        String substring = str6.substring(i11, a9.h().f11025a);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        kotlin.jvm.internal.l.d(quote, "quote(...)");
                                        sb2.append(quote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i11 = a9.h().f11026b + 1;
                                    a9 = a9.m();
                                    i12 = 1;
                                }
                                int i13 = i12;
                                if (i11 < str6.length()) {
                                    String substring2 = str6.substring(i11);
                                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    kotlin.jvm.internal.l.d(quote2, "quote(...)");
                                    sb2.append(quote2);
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                kotlin.jvm.internal.l.d(sb3, "toString(...)");
                                nVar.f24993a = o.g(sb3);
                                linkedHashMap.put(str5, nVar);
                                r12 = i13;
                                i102 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = oVar.f25001a;
                        Uri parse2 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        kotlin.jvm.internal.l.b(fragment);
                        o.a(fragment, arrayList2, sb4);
                        return new Db.j(arrayList2, sb4.toString());
                    case 4:
                        Db.j jVar = (Db.j) oVar.f25007h.getValue();
                        return (jVar == null || (list = (List) jVar.f3354a) == null) ? new ArrayList() : list;
                    case 5:
                        Db.j jVar2 = (Db.j) oVar.f25007h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f3355b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) oVar.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        ac.f[] fVarArr2 = ac.f.f12834a;
                        return new ac.e(str8, 0);
                    default:
                        oVar.getClass();
                        return null;
                }
            }
        });
        Db.h hVar = Db.h.f3352a;
        final int i11 = 2;
        this.f25006f = android.support.v4.media.session.b.y(hVar, new Rb.a(this) { // from class: v2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f24990b;

            {
                this.f24990b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v41, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v45, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // Rb.a
            public final Object invoke() {
                List list;
                ?? r12 = 1;
                int i102 = 0;
                o oVar = this.f24990b;
                switch (i11) {
                    case 0:
                        String str2 = oVar.f25003c;
                        if (str2 == null) {
                            return null;
                        }
                        ac.f[] fVarArr = ac.f.f12834a;
                        return new ac.e(str2, 0);
                    case 1:
                        String str3 = oVar.f25001a;
                        return Boolean.valueOf(str3 != null && o.f25000r.d(str3));
                    case 2:
                        oVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f25005e.getValue()).booleanValue()) {
                            String str4 = oVar.f25001a;
                            Uri parse = Uri.parse(str4);
                            kotlin.jvm.internal.l.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > r12) {
                                    throw new IllegalArgumentException(h3.o.n("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Eb.o.Z(queryParameters);
                                if (str6 == null) {
                                    oVar.g = r12;
                                    str6 = str5;
                                }
                                r8.o a9 = ac.e.a(o.f24996n, str6);
                                n nVar = new n();
                                int i112 = i102;
                                int i12 = r12;
                                while (a9 != null) {
                                    ac.d o10 = ((V.k) a9.f23859d).o(i12);
                                    kotlin.jvm.internal.l.b(o10);
                                    nVar.f24994b.add(o10.f12831a);
                                    if (a9.h().f11025a > i112) {
                                        String substring = str6.substring(i112, a9.h().f11025a);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        kotlin.jvm.internal.l.d(quote, "quote(...)");
                                        sb2.append(quote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i112 = a9.h().f11026b + 1;
                                    a9 = a9.m();
                                    i12 = 1;
                                }
                                int i13 = i12;
                                if (i112 < str6.length()) {
                                    String substring2 = str6.substring(i112);
                                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    kotlin.jvm.internal.l.d(quote2, "quote(...)");
                                    sb2.append(quote2);
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                kotlin.jvm.internal.l.d(sb3, "toString(...)");
                                nVar.f24993a = o.g(sb3);
                                linkedHashMap.put(str5, nVar);
                                r12 = i13;
                                i102 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = oVar.f25001a;
                        Uri parse2 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        kotlin.jvm.internal.l.b(fragment);
                        o.a(fragment, arrayList2, sb4);
                        return new Db.j(arrayList2, sb4.toString());
                    case 4:
                        Db.j jVar = (Db.j) oVar.f25007h.getValue();
                        return (jVar == null || (list = (List) jVar.f3354a) == null) ? new ArrayList() : list;
                    case 5:
                        Db.j jVar2 = (Db.j) oVar.f25007h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f3355b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) oVar.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        ac.f[] fVarArr2 = ac.f.f12834a;
                        return new ac.e(str8, 0);
                    default:
                        oVar.getClass();
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f25007h = android.support.v4.media.session.b.y(hVar, new Rb.a(this) { // from class: v2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f24990b;

            {
                this.f24990b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v41, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v45, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // Rb.a
            public final Object invoke() {
                List list;
                ?? r12 = 1;
                int i102 = 0;
                o oVar = this.f24990b;
                switch (i12) {
                    case 0:
                        String str2 = oVar.f25003c;
                        if (str2 == null) {
                            return null;
                        }
                        ac.f[] fVarArr = ac.f.f12834a;
                        return new ac.e(str2, 0);
                    case 1:
                        String str3 = oVar.f25001a;
                        return Boolean.valueOf(str3 != null && o.f25000r.d(str3));
                    case 2:
                        oVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f25005e.getValue()).booleanValue()) {
                            String str4 = oVar.f25001a;
                            Uri parse = Uri.parse(str4);
                            kotlin.jvm.internal.l.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > r12) {
                                    throw new IllegalArgumentException(h3.o.n("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Eb.o.Z(queryParameters);
                                if (str6 == null) {
                                    oVar.g = r12;
                                    str6 = str5;
                                }
                                r8.o a9 = ac.e.a(o.f24996n, str6);
                                n nVar = new n();
                                int i112 = i102;
                                int i122 = r12;
                                while (a9 != null) {
                                    ac.d o10 = ((V.k) a9.f23859d).o(i122);
                                    kotlin.jvm.internal.l.b(o10);
                                    nVar.f24994b.add(o10.f12831a);
                                    if (a9.h().f11025a > i112) {
                                        String substring = str6.substring(i112, a9.h().f11025a);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        kotlin.jvm.internal.l.d(quote, "quote(...)");
                                        sb2.append(quote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i112 = a9.h().f11026b + 1;
                                    a9 = a9.m();
                                    i122 = 1;
                                }
                                int i13 = i122;
                                if (i112 < str6.length()) {
                                    String substring2 = str6.substring(i112);
                                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    kotlin.jvm.internal.l.d(quote2, "quote(...)");
                                    sb2.append(quote2);
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                kotlin.jvm.internal.l.d(sb3, "toString(...)");
                                nVar.f24993a = o.g(sb3);
                                linkedHashMap.put(str5, nVar);
                                r12 = i13;
                                i102 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = oVar.f25001a;
                        Uri parse2 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        kotlin.jvm.internal.l.b(fragment);
                        o.a(fragment, arrayList2, sb4);
                        return new Db.j(arrayList2, sb4.toString());
                    case 4:
                        Db.j jVar = (Db.j) oVar.f25007h.getValue();
                        return (jVar == null || (list = (List) jVar.f3354a) == null) ? new ArrayList() : list;
                    case 5:
                        Db.j jVar2 = (Db.j) oVar.f25007h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f3355b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) oVar.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        ac.f[] fVarArr2 = ac.f.f12834a;
                        return new ac.e(str8, 0);
                    default:
                        oVar.getClass();
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f25008i = android.support.v4.media.session.b.y(hVar, new Rb.a(this) { // from class: v2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f24990b;

            {
                this.f24990b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v41, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v45, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // Rb.a
            public final Object invoke() {
                List list;
                ?? r12 = 1;
                int i102 = 0;
                o oVar = this.f24990b;
                switch (i13) {
                    case 0:
                        String str2 = oVar.f25003c;
                        if (str2 == null) {
                            return null;
                        }
                        ac.f[] fVarArr = ac.f.f12834a;
                        return new ac.e(str2, 0);
                    case 1:
                        String str3 = oVar.f25001a;
                        return Boolean.valueOf(str3 != null && o.f25000r.d(str3));
                    case 2:
                        oVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f25005e.getValue()).booleanValue()) {
                            String str4 = oVar.f25001a;
                            Uri parse = Uri.parse(str4);
                            kotlin.jvm.internal.l.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > r12) {
                                    throw new IllegalArgumentException(h3.o.n("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Eb.o.Z(queryParameters);
                                if (str6 == null) {
                                    oVar.g = r12;
                                    str6 = str5;
                                }
                                r8.o a9 = ac.e.a(o.f24996n, str6);
                                n nVar = new n();
                                int i112 = i102;
                                int i122 = r12;
                                while (a9 != null) {
                                    ac.d o10 = ((V.k) a9.f23859d).o(i122);
                                    kotlin.jvm.internal.l.b(o10);
                                    nVar.f24994b.add(o10.f12831a);
                                    if (a9.h().f11025a > i112) {
                                        String substring = str6.substring(i112, a9.h().f11025a);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        kotlin.jvm.internal.l.d(quote, "quote(...)");
                                        sb2.append(quote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i112 = a9.h().f11026b + 1;
                                    a9 = a9.m();
                                    i122 = 1;
                                }
                                int i132 = i122;
                                if (i112 < str6.length()) {
                                    String substring2 = str6.substring(i112);
                                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    kotlin.jvm.internal.l.d(quote2, "quote(...)");
                                    sb2.append(quote2);
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                kotlin.jvm.internal.l.d(sb3, "toString(...)");
                                nVar.f24993a = o.g(sb3);
                                linkedHashMap.put(str5, nVar);
                                r12 = i132;
                                i102 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = oVar.f25001a;
                        Uri parse2 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        kotlin.jvm.internal.l.b(fragment);
                        o.a(fragment, arrayList2, sb4);
                        return new Db.j(arrayList2, sb4.toString());
                    case 4:
                        Db.j jVar = (Db.j) oVar.f25007h.getValue();
                        return (jVar == null || (list = (List) jVar.f3354a) == null) ? new ArrayList() : list;
                    case 5:
                        Db.j jVar2 = (Db.j) oVar.f25007h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f3355b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) oVar.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        ac.f[] fVarArr2 = ac.f.f12834a;
                        return new ac.e(str8, 0);
                    default:
                        oVar.getClass();
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.j = android.support.v4.media.session.b.y(hVar, new Rb.a(this) { // from class: v2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f24990b;

            {
                this.f24990b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v41, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v45, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // Rb.a
            public final Object invoke() {
                List list;
                ?? r12 = 1;
                int i102 = 0;
                o oVar = this.f24990b;
                switch (i14) {
                    case 0:
                        String str2 = oVar.f25003c;
                        if (str2 == null) {
                            return null;
                        }
                        ac.f[] fVarArr = ac.f.f12834a;
                        return new ac.e(str2, 0);
                    case 1:
                        String str3 = oVar.f25001a;
                        return Boolean.valueOf(str3 != null && o.f25000r.d(str3));
                    case 2:
                        oVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f25005e.getValue()).booleanValue()) {
                            String str4 = oVar.f25001a;
                            Uri parse = Uri.parse(str4);
                            kotlin.jvm.internal.l.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > r12) {
                                    throw new IllegalArgumentException(h3.o.n("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Eb.o.Z(queryParameters);
                                if (str6 == null) {
                                    oVar.g = r12;
                                    str6 = str5;
                                }
                                r8.o a9 = ac.e.a(o.f24996n, str6);
                                n nVar = new n();
                                int i112 = i102;
                                int i122 = r12;
                                while (a9 != null) {
                                    ac.d o10 = ((V.k) a9.f23859d).o(i122);
                                    kotlin.jvm.internal.l.b(o10);
                                    nVar.f24994b.add(o10.f12831a);
                                    if (a9.h().f11025a > i112) {
                                        String substring = str6.substring(i112, a9.h().f11025a);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        kotlin.jvm.internal.l.d(quote, "quote(...)");
                                        sb2.append(quote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i112 = a9.h().f11026b + 1;
                                    a9 = a9.m();
                                    i122 = 1;
                                }
                                int i132 = i122;
                                if (i112 < str6.length()) {
                                    String substring2 = str6.substring(i112);
                                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    kotlin.jvm.internal.l.d(quote2, "quote(...)");
                                    sb2.append(quote2);
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                kotlin.jvm.internal.l.d(sb3, "toString(...)");
                                nVar.f24993a = o.g(sb3);
                                linkedHashMap.put(str5, nVar);
                                r12 = i132;
                                i102 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = oVar.f25001a;
                        Uri parse2 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        kotlin.jvm.internal.l.b(fragment);
                        o.a(fragment, arrayList2, sb4);
                        return new Db.j(arrayList2, sb4.toString());
                    case 4:
                        Db.j jVar = (Db.j) oVar.f25007h.getValue();
                        return (jVar == null || (list = (List) jVar.f3354a) == null) ? new ArrayList() : list;
                    case 5:
                        Db.j jVar2 = (Db.j) oVar.f25007h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f3355b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) oVar.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        ac.f[] fVarArr2 = ac.f.f12834a;
                        return new ac.e(str8, 0);
                    default:
                        oVar.getClass();
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.k = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: v2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f24990b;

            {
                this.f24990b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v41, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v45, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // Rb.a
            public final Object invoke() {
                List list;
                ?? r12 = 1;
                int i102 = 0;
                o oVar = this.f24990b;
                switch (i15) {
                    case 0:
                        String str2 = oVar.f25003c;
                        if (str2 == null) {
                            return null;
                        }
                        ac.f[] fVarArr = ac.f.f12834a;
                        return new ac.e(str2, 0);
                    case 1:
                        String str3 = oVar.f25001a;
                        return Boolean.valueOf(str3 != null && o.f25000r.d(str3));
                    case 2:
                        oVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f25005e.getValue()).booleanValue()) {
                            String str4 = oVar.f25001a;
                            Uri parse = Uri.parse(str4);
                            kotlin.jvm.internal.l.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > r12) {
                                    throw new IllegalArgumentException(h3.o.n("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Eb.o.Z(queryParameters);
                                if (str6 == null) {
                                    oVar.g = r12;
                                    str6 = str5;
                                }
                                r8.o a9 = ac.e.a(o.f24996n, str6);
                                n nVar = new n();
                                int i112 = i102;
                                int i122 = r12;
                                while (a9 != null) {
                                    ac.d o10 = ((V.k) a9.f23859d).o(i122);
                                    kotlin.jvm.internal.l.b(o10);
                                    nVar.f24994b.add(o10.f12831a);
                                    if (a9.h().f11025a > i112) {
                                        String substring = str6.substring(i112, a9.h().f11025a);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        kotlin.jvm.internal.l.d(quote, "quote(...)");
                                        sb2.append(quote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i112 = a9.h().f11026b + 1;
                                    a9 = a9.m();
                                    i122 = 1;
                                }
                                int i132 = i122;
                                if (i112 < str6.length()) {
                                    String substring2 = str6.substring(i112);
                                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    kotlin.jvm.internal.l.d(quote2, "quote(...)");
                                    sb2.append(quote2);
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                kotlin.jvm.internal.l.d(sb3, "toString(...)");
                                nVar.f24993a = o.g(sb3);
                                linkedHashMap.put(str5, nVar);
                                r12 = i132;
                                i102 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = oVar.f25001a;
                        Uri parse2 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        kotlin.jvm.internal.l.b(fragment);
                        o.a(fragment, arrayList2, sb4);
                        return new Db.j(arrayList2, sb4.toString());
                    case 4:
                        Db.j jVar = (Db.j) oVar.f25007h.getValue();
                        return (jVar == null || (list = (List) jVar.f3354a) == null) ? new ArrayList() : list;
                    case 5:
                        Db.j jVar2 = (Db.j) oVar.f25007h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f3355b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) oVar.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        ac.f[] fVarArr2 = ac.f.f12834a;
                        return new ac.e(str8, 0);
                    default:
                        oVar.getClass();
                        return null;
                }
            }
        });
        final int i16 = 7;
        android.support.v4.media.session.b.z(new Rb.a(this) { // from class: v2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f24990b;

            {
                this.f24990b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v41, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v45, types: [Db.g, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // Rb.a
            public final Object invoke() {
                List list;
                ?? r12 = 1;
                int i102 = 0;
                o oVar = this.f24990b;
                switch (i16) {
                    case 0:
                        String str2 = oVar.f25003c;
                        if (str2 == null) {
                            return null;
                        }
                        ac.f[] fVarArr = ac.f.f12834a;
                        return new ac.e(str2, 0);
                    case 1:
                        String str3 = oVar.f25001a;
                        return Boolean.valueOf(str3 != null && o.f25000r.d(str3));
                    case 2:
                        oVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) oVar.f25005e.getValue()).booleanValue()) {
                            String str4 = oVar.f25001a;
                            Uri parse = Uri.parse(str4);
                            kotlin.jvm.internal.l.d(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > r12) {
                                    throw new IllegalArgumentException(h3.o.n("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Eb.o.Z(queryParameters);
                                if (str6 == null) {
                                    oVar.g = r12;
                                    str6 = str5;
                                }
                                r8.o a9 = ac.e.a(o.f24996n, str6);
                                n nVar = new n();
                                int i112 = i102;
                                int i122 = r12;
                                while (a9 != null) {
                                    ac.d o10 = ((V.k) a9.f23859d).o(i122);
                                    kotlin.jvm.internal.l.b(o10);
                                    nVar.f24994b.add(o10.f12831a);
                                    if (a9.h().f11025a > i112) {
                                        String substring = str6.substring(i112, a9.h().f11025a);
                                        kotlin.jvm.internal.l.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        kotlin.jvm.internal.l.d(quote, "quote(...)");
                                        sb2.append(quote);
                                    }
                                    sb2.append("([\\s\\S]+?)?");
                                    i112 = a9.h().f11026b + 1;
                                    a9 = a9.m();
                                    i122 = 1;
                                }
                                int i132 = i122;
                                if (i112 < str6.length()) {
                                    String substring2 = str6.substring(i112);
                                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    kotlin.jvm.internal.l.d(quote2, "quote(...)");
                                    sb2.append(quote2);
                                }
                                sb2.append("$");
                                String sb3 = sb2.toString();
                                kotlin.jvm.internal.l.d(sb3, "toString(...)");
                                nVar.f24993a = o.g(sb3);
                                linkedHashMap.put(str5, nVar);
                                r12 = i132;
                                i102 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = oVar.f25001a;
                        Uri parse2 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        kotlin.jvm.internal.l.d(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        kotlin.jvm.internal.l.b(fragment);
                        o.a(fragment, arrayList2, sb4);
                        return new Db.j(arrayList2, sb4.toString());
                    case 4:
                        Db.j jVar = (Db.j) oVar.f25007h.getValue();
                        return (jVar == null || (list = (List) jVar.f3354a) == null) ? new ArrayList() : list;
                    case 5:
                        Db.j jVar2 = (Db.j) oVar.f25007h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f3355b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) oVar.j.getValue();
                        if (str8 == null) {
                            return null;
                        }
                        ac.f[] fVarArr2 = ac.f.f12834a;
                        return new ac.e(str8, 0);
                    default:
                        oVar.getClass();
                        return null;
                }
            }
        });
        StringBuilder sb2 = new StringBuilder("^");
        if (!f24995m.f12833a.matcher(str).find()) {
            String pattern = f24997o.f12833a.pattern();
            kotlin.jvm.internal.l.d(pattern, "pattern(...)");
            sb2.append(pattern);
        }
        r8.o a9 = ac.e.a(new ac.e("(\\?|#|$)"), str);
        if (a9 != null) {
            boolean z8 = false;
            String substring = str.substring(0, a9.h().f11025a);
            kotlin.jvm.internal.l.d(substring, "substring(...)");
            a(substring, arrayList, sb2);
            if (!f24998p.f12833a.matcher(sb2).find() && !f24999q.f12833a.matcher(sb2).find()) {
                z8 = true;
            }
            this.f25009l = z8;
            sb2.append("($|(\\?(.)*)|(#(.)*))");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        this.f25003c = g(sb3);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        int i7 = 0;
        for (r8.o a9 = ac.e.a(f24996n, str); a9 != null; a9 = a9.m()) {
            ac.d o10 = ((V.k) a9.f23859d).o(1);
            kotlin.jvm.internal.l.b(o10);
            arrayList.add(o10.f12831a);
            if (a9.h().f11025a > i7) {
                String substring = str.substring(i7, a9.h().f11025a);
                kotlin.jvm.internal.l.d(substring, "substring(...)");
                String quote = Pattern.quote(substring);
                kotlin.jvm.internal.l.d(quote, "quote(...)");
                sb2.append(quote);
            }
            String pattern = f24999q.f12833a.pattern();
            kotlin.jvm.internal.l.d(pattern, "pattern(...)");
            sb2.append(pattern);
            i7 = a9.h().f11026b + 1;
        }
        if (i7 < str.length()) {
            String substring2 = str.substring(i7);
            kotlin.jvm.internal.l.d(substring2, "substring(...)");
            String quote2 = Pattern.quote(substring2);
            kotlin.jvm.internal.l.d(quote2, "quote(...)");
            sb2.append(quote2);
        }
    }

    public static String g(String str) {
        return (ac.g.b0(str, "\\Q") && ac.g.b0(str, "\\E")) ? ac.n.W(str, ".*", "\\E.*\\Q") : ac.g.b0(str, "\\.\\*") ? ac.n.W(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        String str = this.f25001a;
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(str);
        kotlin.jvm.internal.l.d(parse, "parse(...)");
        List<String> other = parse.getPathSegments();
        kotlin.jvm.internal.l.e(pathSegments, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        LinkedHashSet linkedHashSet = new LinkedHashSet(pathSegments);
        linkedHashSet.retainAll(other);
        return linkedHashSet.size();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Db.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Db.g, java.lang.Object] */
    public final ArrayList c() {
        ArrayList arrayList = this.f25002b;
        Collection values = ((Map) this.f25006f.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Eb.o.U(arrayList2, ((n) it.next()).f24994b);
        }
        return Eb.o.i0(Eb.o.i0(arrayList, arrayList2), (List) this.f25008i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [Db.g, java.lang.Object] */
    public final Bundle d(Uri deepLink, LinkedHashMap arguments) {
        r8.o c10;
        r8.o c11;
        String str;
        kotlin.jvm.internal.l.e(deepLink, "deepLink");
        kotlin.jvm.internal.l.e(arguments, "arguments");
        ac.e eVar = (ac.e) this.f25004d.getValue();
        if (eVar == null || (c10 = eVar.c(deepLink.toString())) == null) {
            return null;
        }
        int i7 = 0;
        Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
        if (!e(c10, f4, arguments)) {
            return null;
        }
        if (((Boolean) this.f25005e.getValue()).booleanValue() && !f(deepLink, f4, arguments)) {
            return null;
        }
        String fragment = deepLink.getFragment();
        ac.e eVar2 = (ac.e) this.k.getValue();
        if (eVar2 != null && (c11 = eVar2.c(String.valueOf(fragment))) != null) {
            List list = (List) this.f25008i.getValue();
            ArrayList arrayList = new ArrayList(Eb.p.S(list, 10));
            for (Object obj : list) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    u0.M();
                    throw null;
                }
                String str2 = (String) obj;
                ac.d o10 = ((V.k) c11.f23859d).o(i10);
                if (o10 != null) {
                    str = Uri.decode(o10.f12831a);
                    kotlin.jvm.internal.l.d(str, "decode(...)");
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (arguments.get(str2) != null) {
                    throw new ClassCastException();
                }
                try {
                    AbstractC0672a.o(str2, str, f4);
                    arrayList.add(Db.q.f3365a);
                    i7 = i10;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        if (tc.b.A(arguments, new m(0, f4)).isEmpty()) {
            return f4;
        }
        return null;
    }

    public final boolean e(r8.o oVar, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f25002b;
        ArrayList arrayList2 = new ArrayList(Eb.p.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i10 = i7 + 1;
            String str = null;
            if (i7 < 0) {
                u0.M();
                throw null;
            }
            String str2 = (String) next;
            ac.d o10 = ((V.k) oVar.f23859d).o(i10);
            if (o10 != null) {
                str = Uri.decode(o10.f12831a);
                kotlin.jvm.internal.l.d(str, "decode(...)");
            }
            if (str == null) {
                str = "";
            }
            if (linkedHashMap.get(str2) != null) {
                throw new ClassCastException();
            }
            try {
                AbstractC0672a.o(str2, str, bundle);
                arrayList2.add(Db.q.f3365a);
                i7 = i10;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof o)) {
            return false;
        }
        return this.f25001a.equals(((o) obj).f25001a) && kotlin.jvm.internal.l.a(null, null) && kotlin.jvm.internal.l.a(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Db.g, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        r8.o oVar;
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f25006f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            n nVar = (n) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = u0.x(query);
            }
            Db.q qVar = Db.q.f3365a;
            boolean z8 = false;
            Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
            Iterator it = nVar.f24994b.iterator();
            while (it.hasNext()) {
                if (linkedHashMap.get((String) it.next()) != null) {
                    throw new ClassCastException();
                }
            }
            for (String input : queryParameters) {
                String str2 = nVar.f24993a;
                if (str2 != null) {
                    Pattern compile = Pattern.compile(str2);
                    kotlin.jvm.internal.l.d(compile, "compile(...)");
                    kotlin.jvm.internal.l.e(input, "input");
                    Matcher matcher = compile.matcher(input);
                    kotlin.jvm.internal.l.d(matcher, "matcher(...)");
                    if (matcher.matches()) {
                        oVar = new r8.o(matcher, input);
                        if (oVar != null) {
                            return z8;
                        }
                        ArrayList arrayList = nVar.f24994b;
                        ArrayList arrayList2 = new ArrayList(Eb.p.S(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        ?? r14 = z8;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i7 = r14 + 1;
                            if (r14 < 0) {
                                u0.M();
                                throw null;
                            }
                            String key = (String) next;
                            ac.d o10 = ((V.k) oVar.f23859d).o(i7);
                            String str3 = o10 != null ? o10.f12831a : null;
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (linkedHashMap.get(key) != null) {
                                throw new ClassCastException();
                            }
                            try {
                                kotlin.jvm.internal.l.e(key, "key");
                            } catch (IllegalArgumentException unused) {
                            }
                            if (f4.containsKey(key)) {
                                obj = Boolean.valueOf(!f4.containsKey(key));
                                arrayList2.add(obj);
                                r14 = i7;
                                z8 = false;
                            } else {
                                AbstractC0672a.o(key, str3, f4);
                                obj = qVar;
                                arrayList2.add(obj);
                                r14 = i7;
                                z8 = false;
                            }
                        }
                    }
                }
                oVar = null;
                if (oVar != null) {
                }
            }
            bundle.putAll(f4);
        }
        return true;
    }

    public final int hashCode() {
        return this.f25001a.hashCode() * 961;
    }
}
