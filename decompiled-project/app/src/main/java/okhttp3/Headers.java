package okhttp3;

import Db.j;
import Eb.n;
import c2.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilCommonKt;

/* loaded from: classes2.dex */
public final class Headers implements Iterable<j>, Sb.a {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f22331b = new Companion(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Headers f22332c = new Headers(new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String[] f22333a;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22334a = new ArrayList(20);

        public final Headers a() {
            return new Headers((String[]) this.f22334a.toArray(new String[0]));
        }

        public final void b(String name) {
            l.e(name, "name");
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f22334a;
                if (i7 >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i7))) {
                    arrayList.remove(i7);
                    arrayList.remove(i7);
                    i7 -= 2;
                }
                i7 += 2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    public Headers(String[] namesAndValues) {
        l.e(namesAndValues, "namesAndValues");
        this.f22333a = namesAndValues;
    }

    public final String b(String str) {
        String[] namesAndValues = this.f22333a;
        l.e(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int l10 = q.l(length, 0, -2);
        if (l10 <= length) {
            while (!str.equalsIgnoreCase(namesAndValues[length])) {
                if (length != l10) {
                    length -= 2;
                }
            }
            return namesAndValues[length + 1];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            if (Arrays.equals(this.f22333a, ((Headers) obj).f22333a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22333a);
    }

    @Override // java.lang.Iterable
    public final Iterator<j> iterator() {
        int size = size();
        j[] jVarArr = new j[size];
        for (int i7 = 0; i7 < size; i7++) {
            jVarArr[i7] = new j(o(i7), y(i7));
        }
        return l.h(jVarArr);
    }

    public final String o(int i7) {
        String str = (String) n.Z(i7 * 2, this.f22333a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i7 + ']');
    }

    public final int size() {
        return this.f22333a.length / 2;
    }

    public final Builder t() {
        Builder builder = new Builder();
        ArrayList arrayList = builder.f22334a;
        l.e(arrayList, "<this>");
        String[] elements = this.f22333a;
        l.e(elements, "elements");
        arrayList.addAll(n.J(elements));
        return builder;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String o10 = o(i7);
            String y10 = y(i7);
            sb2.append(o10);
            sb2.append(": ");
            if (_UtilCommonKt.i(o10)) {
                y10 = "██";
            }
            sb2.append(y10);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final String y(int i7) {
        String str = (String) n.Z((i7 * 2) + 1, this.f22333a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i7 + ']');
    }
}
