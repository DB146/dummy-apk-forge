package t3;

import Eb.o;
import I2.AbstractC0315d;
import I2.H;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import h3.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import q3.p;
import q3.s;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24476a;

    static {
        String g = z.g("DiagnosticsWrkr");
        kotlin.jvm.internal.l.d(g, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f24476a = g;
    }

    public static final String a(q3.l lVar, s sVar, q3.i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            q3.g u3 = iVar.u(O5.b.p(pVar));
            Integer valueOf = u3 != null ? Integer.valueOf(u3.f23380c) : null;
            lVar.getClass();
            TreeMap treeMap = H.f5039w;
            H a9 = AbstractC0315d.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = pVar.f23403a;
            a9.p(1, str2);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f23391b;
            workDatabase_Impl.b();
            Cursor n6 = P2.j.n(workDatabase_Impl, a9);
            try {
                ArrayList arrayList2 = new ArrayList(n6.getCount());
                while (n6.moveToNext()) {
                    arrayList2.add(n6.getString(0));
                }
                n6.close();
                a9.F();
                String d02 = o.d0(arrayList2, ",", null, null, null, 62);
                String d03 = o.d0(sVar.w(str2), ",", null, null, null, 62);
                StringBuilder n8 = X.c.n("\n", str2, "\t ");
                n8.append(pVar.f23405c);
                n8.append("\t ");
                n8.append(valueOf);
                n8.append("\t ");
                switch (pVar.f23404b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                n8.append(str);
                n8.append("\t ");
                n8.append(d02);
                n8.append("\t ");
                n8.append(d03);
                n8.append('\t');
                sb2.append(n8.toString());
            } catch (Throwable th) {
                n6.close();
                a9.F();
                throw th;
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
