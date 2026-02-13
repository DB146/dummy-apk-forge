package J8;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public class Q extends G8.z {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0019 A[SYNTHETIC] */
    @Override // G8.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        aVar.n();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (aVar.j0() != 4) {
            String d02 = aVar.d0();
            int b02 = aVar.b0();
            d02.getClass();
            char c10 = 65535;
            switch (d02.hashCode()) {
                case -1181204563:
                    if (d02.equals("dayOfMonth")) {
                        c10 = 0;
                    }
                    switch (c10) {
                        case 0:
                            i11 = b02;
                            break;
                        case 1:
                            i13 = b02;
                            break;
                        case 2:
                            i14 = b02;
                            break;
                        case 3:
                            i7 = b02;
                            break;
                        case 4:
                            i10 = b02;
                            break;
                        case 5:
                            i12 = b02;
                            break;
                    }
                    break;
                case -1074026988:
                    if (d02.equals("minute")) {
                        c10 = 1;
                    }
                    switch (c10) {
                    }
                    break;
                case -906279820:
                    if (d02.equals("second")) {
                        c10 = 2;
                    }
                    switch (c10) {
                    }
                    break;
                case 3704893:
                    if (d02.equals("year")) {
                        c10 = 3;
                    }
                    switch (c10) {
                    }
                    break;
                case 104080000:
                    if (d02.equals("month")) {
                        c10 = 4;
                    }
                    switch (c10) {
                    }
                    break;
                case 985252545:
                    if (d02.equals("hourOfDay")) {
                        c10 = 5;
                    }
                    switch (c10) {
                    }
                    break;
                default:
                    switch (c10) {
                    }
                    break;
            }
        }
        aVar.T();
        return new GregorianCalendar(i7, i10, i11, i12, i13, i14);
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        if (((Calendar) obj) == null) {
            bVar.W();
            return;
        }
        bVar.F();
        bVar.U("year");
        bVar.c0(r4.get(1));
        bVar.U("month");
        bVar.c0(r4.get(2));
        bVar.U("dayOfMonth");
        bVar.c0(r4.get(5));
        bVar.U("hourOfDay");
        bVar.c0(r4.get(11));
        bVar.U("minute");
        bVar.c0(r4.get(12));
        bVar.U("second");
        bVar.c0(r4.get(13));
        bVar.T();
    }
}
