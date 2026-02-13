package P2;

import A0.C0028q;
import Eb.p;
import Eb.v;
import Eb.w;
import Eb.x;
import H2.C0297k;
import I2.C0313b;
import I2.E;
import I2.J;
import a.AbstractC0672a;
import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import cc.F;
import hc.C1277e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import y7.u0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f7798a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static final int a(T2.c cVar, String str) {
        kotlin.jvm.internal.l.e(cVar, "<this>");
        int b2 = b(cVar, str);
        if (b2 >= 0) {
            return b2;
        }
        int b10 = b(cVar, "`" + str + '`');
        if (b10 >= 0) {
            return b10;
        }
        int i7 = -1;
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int k = cVar.k();
            String concat = ".".concat(str);
            String str2 = "." + str + '`';
            for (int i10 = 0; i10 < k; i10++) {
                String G9 = cVar.G(i10);
                if (G9.length() >= str.length() + 2 && (ac.n.S(G9, concat, false) || (G9.charAt(0) == '`' && ac.n.S(G9, str2, false)))) {
                    i7 = i10;
                    break;
                }
            }
        }
        return i7;
    }

    public static final int b(T2.c cVar, String name) {
        kotlin.jvm.internal.l.e(cVar, "<this>");
        kotlin.jvm.internal.l.e(name, "name");
        int k = cVar.k();
        for (int i7 = 0; i7 < k; i7++) {
            if (name.equals(cVar.G(i7))) {
                return i7;
            }
        }
        return -1;
    }

    public static final boolean c(String current, String str) {
        kotlin.jvm.internal.l.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i7 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i7 < current.length()) {
                    char charAt = current.charAt(i7);
                    int i12 = i11 + 1;
                    if (i11 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i10++;
                    } else if (charAt == ')' && i10 - 1 == 0 && i11 != current.length() - 1) {
                        break;
                    }
                    i7++;
                    i11 = i12;
                } else if (i10 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    kotlin.jvm.internal.l.d(substring, "substring(...)");
                    return kotlin.jvm.internal.l.a(ac.g.v0(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static final void d(T2.a connection) {
        kotlin.jvm.internal.l.e(connection, "connection");
        Fb.b m10 = u0.m();
        T2.c R10 = connection.R("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (R10.J()) {
            try {
                m10.add(R10.j(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Tb.a.g(R10, th);
                    throw th2;
                }
            }
        }
        Tb.a.g(R10, null);
        ListIterator listIterator = u0.i(m10).listIterator(0);
        while (true) {
            C0028q c0028q = (C0028q) listIterator;
            if (!c0028q.hasNext()) {
                return;
            }
            String str = (String) c0028q.next();
            if (ac.n.Y(str, "room_fts_content_sync_", false)) {
                AbstractC0672a.h(connection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0054 A[EDGE_INSN: B:49:0x0054->B:32:0x0054 BREAK  A[LOOP:0: B:10:0x0016->B:34:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List e(D5.i iVar, int i7, int i10) {
        Db.j jVar;
        boolean z8;
        kotlin.jvm.internal.l.e(iVar, "<this>");
        if (i7 == i10) {
            return v.f3891a;
        }
        boolean z10 = i10 > i7;
        ArrayList arrayList = new ArrayList();
        do {
            if (z10) {
                if (i7 >= i10) {
                    return arrayList;
                }
            } else if (i7 <= i10) {
                return arrayList;
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) iVar.f3256b;
            if (z10) {
                TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i7));
                if (treeMap != null) {
                    jVar = new Db.j(treeMap, treeMap.descendingKeySet());
                    if (jVar != null) {
                        break;
                    }
                    Map map = (Map) jVar.f3354a;
                    Iterator it = ((Iterable) jVar.f3355b).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!z10) {
                            if (i10 <= intValue && intValue < i7) {
                                Object obj = map.get(Integer.valueOf(intValue));
                                kotlin.jvm.internal.l.b(obj);
                                arrayList.add(obj);
                                z8 = true;
                                i7 = intValue;
                                break;
                                break;
                            }
                        } else if (i7 + 1 <= intValue && intValue <= i10) {
                            Object obj2 = map.get(Integer.valueOf(intValue));
                            kotlin.jvm.internal.l.b(obj2);
                            arrayList.add(obj2);
                            z8 = true;
                            i7 = intValue;
                            break;
                        }
                    }
                    z8 = false;
                }
                jVar = null;
                if (jVar != null) {
                }
            } else {
                TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i7));
                if (treeMap2 != null) {
                    jVar = new Db.j(treeMap2, treeMap2.keySet());
                    if (jVar != null) {
                    }
                }
                jVar = null;
                if (jVar != null) {
                }
            }
        } while (z8);
        return null;
    }

    public static final String f(Collection collection) {
        kotlin.jvm.internal.l.e(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return ac.h.P(Eb.o.d0(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static final int g(T2.c stmt, String str) {
        kotlin.jvm.internal.l.e(stmt, "stmt");
        return a(stmt, str);
    }

    public static final int h(T2.c stmt, String str) {
        kotlin.jvm.internal.l.e(stmt, "stmt");
        int a9 = a(stmt, str);
        if (a9 >= 0) {
            return a9;
        }
        int k = stmt.k();
        ArrayList arrayList = new ArrayList(k);
        for (int i7 = 0; i7 < k; i7++) {
            arrayList.add(stmt.G(i7));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + Eb.o.d0(arrayList, null, null, null, null, 63) + ']');
    }

    public static final int i(Cursor c10, String str) {
        String str2;
        kotlin.jvm.internal.l.e(c10, "c");
        int columnIndex = c10.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c10.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                int i7 = -1;
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c10.getColumnNames();
                    kotlin.jvm.internal.l.b(columnNames);
                    String concat = ".".concat(str);
                    String str3 = "." + str + '`';
                    int length = columnNames.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        String str4 = columnNames[i10];
                        int i12 = i11 + 1;
                        if (str4.length() >= str.length() + 2 && (ac.n.S(str4, concat, false) || (str4.charAt(0) == '`' && ac.n.S(str4, str3, false)))) {
                            i7 = i11;
                            break;
                        }
                        i10++;
                        i11 = i12;
                    }
                }
                columnIndex = i7;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c10.getColumnNames();
            kotlin.jvm.internal.l.d(columnNames2, "getColumnNames(...)");
            str2 = Eb.n.b0(63, columnNames2);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str2 = "unknown";
        }
        throw new IllegalArgumentException(A3.c.j("column '", str, "' does not exist. Available columns: ", str2));
    }

    public static final Hb.i j(E e2, boolean z8, Jb.c cVar) {
        if (!e2.p()) {
            C1277e c1277e = e2.f5026a;
            if (c1277e != null) {
                return c1277e.f17939a;
            }
            kotlin.jvm.internal.l.j("coroutineScope");
            throw null;
        }
        if (cVar.getContext().get(J.f5051a) != null) {
            throw new ClassCastException();
        }
        if (!z8) {
            return e2.k();
        }
        Hb.i iVar = e2.f5027b;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.l.j("transactionContext");
        throw null;
    }

    public static final boolean k(C0313b c0313b, int i7, int i10) {
        kotlin.jvm.internal.l.e(c0313b, "<this>");
        if ((i7 > i10 && c0313b.f5136l) || !c0313b.k) {
            return false;
        }
        Set set = c0313b.f5137m;
        return set == null || !set.contains(Integer.valueOf(i7));
    }

    public static final Set l(String createStatement) {
        Character ch;
        kotlin.jvm.internal.l.e(createStatement, "createStatement");
        if (createStatement.length() == 0) {
            return x.f3893a;
        }
        String substring = createStatement.substring(ac.g.e0(createStatement, '(', 0, 6) + 1, ac.g.j0(createStatement, ')', 0, 6));
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        ArrayList arrayList = new ArrayList();
        Eb.l lVar = new Eb.l();
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < substring.length()) {
            char charAt = substring.charAt(i10);
            int i12 = i11 + 1;
            if (charAt != '\"' && charAt != '\'') {
                if (charAt != ',') {
                    if (charAt != '[') {
                        if (charAt != ']') {
                            if (charAt != '`') {
                            }
                        } else if (!lVar.isEmpty() && (ch = (Character) lVar.z()) != null && ch.charValue() == '[') {
                            Eb.o.k0(lVar);
                        }
                    } else if (lVar.isEmpty()) {
                        lVar.addFirst(Character.valueOf(charAt));
                    }
                } else if (lVar.isEmpty()) {
                    String substring2 = substring.substring(i7 + 1, i11);
                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                    int length = substring2.length() - 1;
                    int i13 = 0;
                    boolean z8 = false;
                    while (i13 <= length) {
                        boolean z10 = kotlin.jvm.internal.l.f(substring2.charAt(!z8 ? i13 : length), 32) <= 0;
                        if (z8) {
                            if (!z10) {
                                break;
                            }
                            length--;
                        } else if (z10) {
                            i13++;
                        } else {
                            z8 = true;
                        }
                    }
                    arrayList.add(substring2.subSequence(i13, length + 1).toString());
                    i7 = i11;
                }
                i10++;
                i11 = i12;
            }
            if (lVar.isEmpty()) {
                lVar.addFirst(Character.valueOf(charAt));
            } else {
                Character ch2 = (Character) lVar.z();
                if (ch2 != null && ch2.charValue() == charAt) {
                    Eb.o.k0(lVar);
                }
            }
            i10++;
            i11 = i12;
        }
        String substring3 = substring.substring(i7 + 1);
        kotlin.jvm.internal.l.d(substring3, "substring(...)");
        arrayList.add(ac.g.v0(substring3).toString());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = (String) next;
            String[] strArr = f7798a;
            int i14 = 0;
            while (true) {
                if (i14 >= 9) {
                    break;
                }
                if (ac.n.Y(str, strArr[i14], false)) {
                    arrayList2.add(next);
                    break;
                }
                i14++;
            }
        }
        return Eb.o.w0(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(E e2, boolean z8, boolean z10, Rb.c cVar, Jb.c cVar2) {
        Jb.c cVar3;
        int i7;
        Rb.c cVar4;
        boolean z11;
        E e10;
        boolean z12;
        if (cVar2 instanceof e) {
            e eVar = (e) cVar2;
            int i10 = eVar.f7781f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f7781f = i10 - Integer.MIN_VALUE;
                cVar3 = eVar;
                e eVar2 = cVar3;
                Object obj = eVar2.f7780e;
                Ib.a aVar = Ib.a.f5345a;
                i7 = eVar2.f7781f;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            boolean z13 = eVar2.f7779d;
                            boolean z14 = eVar2.f7778c;
                            Rb.c cVar5 = eVar2.f7777b;
                            E e11 = eVar2.f7776a;
                            com.bumptech.glide.c.c0(obj);
                            z11 = z13;
                            z12 = z14;
                            cVar4 = cVar5;
                            e10 = e11;
                            d dVar = new d(null, e10, cVar4, z12, z11);
                            eVar2.f7776a = null;
                            eVar2.f7777b = null;
                            eVar2.f7781f = 3;
                            obj = F.K((Hb.i) obj, dVar, eVar2);
                            if (obj == aVar) {
                                return aVar;
                            }
                            return obj;
                        }
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    com.bumptech.glide.c.c0(obj);
                    return obj;
                }
                com.bumptech.glide.c.c0(obj);
                if (e2.p() && e2.t() && e2.q()) {
                    g gVar = new g(null, e2, cVar, z10, z8);
                    eVar2.f7781f = 1;
                    obj = e2.w(z8, gVar, eVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    return obj;
                }
                eVar2.f7776a = e2;
                eVar2.f7777b = cVar;
                eVar2.f7778c = z8;
                eVar2.f7779d = z10;
                eVar2.f7781f = 2;
                Hb.i j = j(e2, z10, eVar2);
                if (j == aVar) {
                    return aVar;
                }
                cVar4 = cVar;
                obj = j;
                z11 = z10;
                e10 = e2;
                z12 = z8;
                d dVar2 = new d(null, e10, cVar4, z12, z11);
                eVar2.f7776a = null;
                eVar2.f7777b = null;
                eVar2.f7781f = 3;
                obj = F.K((Hb.i) obj, dVar2, eVar2);
                if (obj == aVar) {
                }
                return obj;
            }
        }
        cVar3 = new Jb.c(cVar2);
        e eVar22 = cVar3;
        Object obj2 = eVar22.f7780e;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = eVar22.f7781f;
        if (i7 == 0) {
        }
    }

    public static final Cursor n(E db2, U2.f fVar) {
        kotlin.jvm.internal.l.e(db2, "db");
        db2.a();
        db2.b();
        return db2.j().N().v(fVar);
    }

    public static i o(T2.a connection, String str) {
        kotlin.jvm.internal.l.e(connection, "connection");
        Fb.i iVar = new Fb.i();
        T2.c R10 = connection.R("PRAGMA table_info(`" + str + "`)");
        try {
            if (R10.J()) {
                int a9 = a(R10, "name");
                do {
                    iVar.add(R10.j(a9));
                } while (R10.J());
            }
            Tb.a.g(R10, null);
            Fb.i i7 = O5.b.i(iVar);
            R10 = connection.R("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String j = R10.J() ? R10.j(a(R10, "sql")) : "";
                Tb.a.g(R10, null);
                return new i(str, i7, l(j));
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01da, code lost:
    
        r0 = O5.b.i(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01de, code lost:
    
        Tb.a.g(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n p(T2.a connection, String str) {
        Map b2;
        Fb.i iVar;
        kotlin.jvm.internal.l.e(connection, "connection");
        T2.c R10 = connection.R("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (R10.J()) {
                int a9 = a(R10, "name");
                int a10 = a(R10, "type");
                int a11 = a(R10, "notnull");
                int a12 = a(R10, "pk");
                int a13 = a(R10, "dflt_value");
                Fb.f fVar = new Fb.f();
                while (true) {
                    String j10 = R10.j(a9);
                    fVar.put(j10, new k((int) R10.x(a12), 2, j10, R10.j(a10), R10.E(a13) ? null : R10.j(a13), R10.x(a11) != j));
                    if (!R10.J()) {
                        break;
                    }
                    j = 0;
                }
                b2 = fVar.b();
                Tb.a.g(R10, null);
            } else {
                b2 = w.f3892a;
                Tb.a.g(R10, null);
            }
            R10 = connection.R("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int a14 = a(R10, "id");
                int a15 = a(R10, "seq");
                int a16 = a(R10, "table");
                int a17 = a(R10, "on_delete");
                int a18 = a(R10, "on_update");
                List r10 = r(R10);
                R10.reset();
                Fb.i iVar2 = new Fb.i();
                while (R10.J()) {
                    if (R10.x(a15) == 0) {
                        int x2 = (int) R10.x(a14);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i7 = a14;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : r10) {
                            int i10 = a15;
                            List list = r10;
                            if (((h) obj).f7791a == x2) {
                                arrayList3.add(obj);
                            }
                            a15 = i10;
                            r10 = list;
                        }
                        int i11 = a15;
                        List list2 = r10;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            h hVar = (h) it.next();
                            arrayList.add(hVar.f7793c);
                            arrayList2.add(hVar.f7794d);
                        }
                        iVar2.add(new l(R10.j(a16), R10.j(a17), R10.j(a18), arrayList, arrayList2));
                        a14 = i7;
                        a15 = i11;
                        r10 = list2;
                    }
                }
                Fb.i i12 = O5.b.i(iVar2);
                Tb.a.g(R10, null);
                R10 = connection.R("PRAGMA index_list(`" + str + "`)");
                try {
                    int a19 = a(R10, "name");
                    int a20 = a(R10, "origin");
                    int a21 = a(R10, "unique");
                    if (a19 == -1 || a20 == -1 || a21 == -1) {
                        Tb.a.g(R10, null);
                        iVar = null;
                    } else {
                        Fb.i iVar3 = new Fb.i();
                        while (true) {
                            if (!R10.J()) {
                                break;
                            }
                            if ("c".equals(R10.j(a20))) {
                                m s3 = s(connection, R10.j(a19), R10.x(a21) == 1);
                                if (s3 == null) {
                                    Tb.a.g(R10, null);
                                    iVar = null;
                                    break;
                                }
                                iVar3.add(s3);
                            }
                        }
                    }
                    return new n(str, b2, i12, iVar);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static o q(T2.a connection, String str) {
        kotlin.jvm.internal.l.e(connection, "connection");
        T2.c R10 = connection.R("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + '\'');
        try {
            o oVar = R10.J() ? new o(R10.j(0), R10.j(1)) : new o(str, null);
            Tb.a.g(R10, null);
            return oVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Tb.a.g(R10, th);
                throw th2;
            }
        }
    }

    public static final List r(T2.c cVar) {
        int a9 = a(cVar, "id");
        int a10 = a(cVar, "seq");
        int a11 = a(cVar, "from");
        int a12 = a(cVar, "to");
        Fb.b m10 = u0.m();
        while (cVar.J()) {
            m10.add(new h((int) cVar.x(a9), (int) cVar.x(a10), cVar.j(a11), cVar.j(a12)));
        }
        return Eb.o.m0(u0.i(m10));
    }

    public static final m s(T2.a aVar, String str, boolean z8) {
        T2.c R10 = aVar.R("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int a9 = a(R10, "seqno");
            int a10 = a(R10, "cid");
            int a11 = a(R10, "name");
            int a12 = a(R10, "desc");
            if (a9 != -1 && a10 != -1 && a11 != -1 && a12 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (R10.J()) {
                    if (((int) R10.x(a10)) >= 0) {
                        int x2 = (int) R10.x(a9);
                        String j = R10.j(a11);
                        String str2 = R10.x(a12) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(x2), j);
                        linkedHashMap2.put(Integer.valueOf(x2), str2);
                    }
                }
                List n02 = Eb.o.n0(new C0297k(5), linkedHashMap.entrySet());
                ArrayList arrayList = new ArrayList(p.S(n02, 10));
                Iterator it = n02.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List s02 = Eb.o.s0(arrayList);
                List n03 = Eb.o.n0(new C0297k(6), linkedHashMap2.entrySet());
                ArrayList arrayList2 = new ArrayList(p.S(n03, 10));
                Iterator it2 = n03.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                m mVar = new m(str, z8, s02, Eb.o.s0(arrayList2));
                Tb.a.g(R10, null);
                return mVar;
            }
            Tb.a.g(R10, null);
            return null;
        } finally {
        }
    }
}
