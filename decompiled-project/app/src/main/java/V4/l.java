package V4;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m4.L;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: n, reason: collision with root package name */
    public static final l f10107n = new l("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List f10108d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10109e;

    /* renamed from: f, reason: collision with root package name */
    public final List f10110f;
    public final List g;

    /* renamed from: h, reason: collision with root package name */
    public final List f10111h;

    /* renamed from: i, reason: collision with root package name */
    public final List f10112i;
    public final L j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f10113l;

    /* renamed from: m, reason: collision with root package name */
    public final List f10114m;

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, L l10, List list7, boolean z8, Map map, List list8) {
        super(str, list, z8);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((k) list2.get(i7)).f10101a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f10108d = Collections.unmodifiableList(arrayList);
        this.f10109e = Collections.unmodifiableList(list2);
        this.f10110f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.f10111h = Collections.unmodifiableList(list5);
        this.f10112i = Collections.unmodifiableList(list6);
        this.j = l10;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f10113l = Collections.unmodifiableMap(map);
        this.f10114m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((j) list.get(i7)).f10098a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i7, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    O4.b bVar = (O4.b) list2.get(i11);
                    if (bVar.f7473b == i7 && bVar.f7474c == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    @Override // O4.a
    public final Object a(List list) {
        return new l(this.f10115a, this.f10116b, c(this.f10109e, 0, list), Collections.emptyList(), c(this.g, 1, list), c(this.f10111h, 2, list), Collections.emptyList(), this.j, this.k, this.f10117c, this.f10113l, this.f10114m);
    }
}
