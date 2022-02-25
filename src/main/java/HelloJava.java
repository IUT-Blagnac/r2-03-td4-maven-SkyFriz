/**
 * Ceci est une classe de test qui ne fait pas grand chose
 * @author JMB
 * @author LC
 */




class ClasseEssai {
	/**
	 *Ca c'est le main
	 *@param le param
	 *@return le retourne
	 */
    public static void main(String[]  argv) {
            int[] tab;
            int   i, som;
            int[] tab3 = {1, 2, 3};

            tab = new int [5];
            for (i = 0; i < tab.length; i++) {
                    tab[i] = 20+i;
            }
            for (i = 0; i < tab.length; i++) {
                    System.out.println (tab[i]);
            }
            som = 0;
            for (i = 0; i < tab3.length; i++) {
                    som = som + tab3[i];
            }
            System.out.println (som);
    }
}