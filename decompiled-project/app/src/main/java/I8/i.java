package I8;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5278a;

    static {
        int i7;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i7 = Integer.parseInt(split[0]);
            if (i7 == 1 && split.length > 1) {
                i7 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i7 = -1;
        }
        if (i7 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char charAt = property.charAt(i10);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb2.append(charAt);
                }
                i7 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i7 = -1;
            }
        }
        if (i7 == -1) {
            i7 = 6;
        }
        f5278a = i7;
    }
}
