package SST;
public class Moving {
    
    public static void getCoordinates(int x, int y){

    }
    
    void move() {
    double angle, deltaX, deltaY, bigger, x, y, finald, finalX, finalY, stopegy;
    int oldQuadrantX, oldQuadrantY;
    int tractorBeam = 0, n, l, iX, iY, kink, kinks, iQuadrant;
    
    Player player = new Player(null, iQuadrant);

    if (player.inOrbit) {
        System.out.println("SULU- \"Leaving standard orbit.\"");
        inOrbit = false;
    }

    double direc = 0.0; // assuming direc is a double variable
    angle = ((15.0 - direc) * 0.5235988);
    deltaX = -Math.sin(angle);
    deltaY = Math.cos(angle);
    if (Math.abs(deltaX) > Math.abs(deltaY))
        bigger = Math.abs(deltaX);
    else
        bigger = Math.abs(deltaY);

    deltaY /= bigger;
    deltaX /= bigger;

    // #ifdef CLOAKING
    if (isCloaked && d.date + Time >= future[FTBEAM]) {
        future[FTBEAM] = d.date + Time + expran(1.5 * intime / d.remcom);
    }
    // #endif

    // If tractor beam is to occur, don't move full distance
    if (d.date + Time >= future[FTBEAM]) {
        trbeam = 1;
        condition = IHRED;
        distance = distance * (future[FTBEAM] - d.date) / Time + 0.1;
        Time = future[FTBEAM] - d.date + 1e-5;
    }

    // Move within the quadrant
    quadrant[sectorX][sectorY] = IHDOT;
    x = sectorX;
    y = sectorY;
    n = (int) (10.0 * distance * bigger + 0.5);

    if (n > 0) {
        for (l = 1; l <= n; l++) {
            ix = (int) (x += deltaX) + 0.5;
            iy = (int) (y += deltaY) + 0.5;
            if (iX < 1 || iX > 10 || iY < 1 || iY > 10) {
                // Leaving quadrant -- allow final enemy attack
                // Don't do it if being pushed by Nova
                if (nenhere != 0 && iattak != 2
                    // #ifdef CLOAKING
                    && !isCloaked
                    // #endif
                ) {
                    newCommand();
                    for (l = 1; l <= nenhere; l++) {
                        finald = Math.sqrt((ix - kx[l]) * (double) (iX - kx[l]) +
                                (iY - ky[l]) * (double) (iY - ky[l]));
                        kavgd[l] = 0.5 * (finald + kdist[l]);
                    }
                    if (d.galaxy[quadrantX][quadrantY] != 1000)
                        attack(0);
                    if (allDone)
                        return;
                }
                // compute final position -- new quadrant and sector
                x = 10 * (quadx - 1) + sectx;
                y = 10 * (quady - 1) + secty;
                ix = (int) (x + 10.0 * dist * bigger * deltax + 0.5);
                iy = (int) (y + 10.0 * dist * bigger * deltay + 0.5);
                // check for edge of galaxy
                kinks = false;
                do {
                    kink = 0;
                    if (ix <= 0) {
                        ix = -ix + 1;
                        kink = 1;
                    }
                    if (iy <= 0) {
                        iy = -iy + 1;
                        kink = 1;
                    }
                    if (ix > 80) {
                        ix = 161 - ix;
                        kink = 1;
                    }
                    if (iy > 80) {
                        iy = 161 - iy;
                        kink = 1;
                    }
                    if (kink)
                        kinks = true;
                } while (kink);

                if (kinks) {
                    nkinks += 1;
                    if (nkinks == 3) {
                        // Three strikes -- you're out!
                        finish(FNEG3);
                        return;
                    }
                    prout("\nYOU HAVE ATTEMPTED TO CROSS THE NEGATIVE ENERGY BARRIER\n"
                            "AT THE EDGE OF THE GALAXY.  THE THIRD TIME YOU TRY THIS,\n"
                            "YOU WILL BE DESTROYED.\n");
                }
                // Compute final position in new quadrant
                if (trbeam)
                    return; // Don't bother if we are to be beamed
                oldquadx = quadx;
                oldquady = quady;
                quadx = (ix + 9) / 10;
                quady = (iy + 9) / 10;
                sectx = ix - 10 * (quadx - 1);
                secty = iy - 10 * (quady - 1);
                if (quadx != oldquadx || quady != oldquady) {
                    proutn("\nEntering");
                    cramlc(1, quadx, quady);
                } else {
                    prout("(Negative energy barrier disturbs quadrant.)");
                }
                skip(1);
                quad[sectx][secty] = ship;
                newqad(0);
                return;
            }
            iquad = quad[ix][iy];
            if (iquad != IHDOT) {
                // object encountered in flight path
                stopegy = 50.0 * dist / Time;
                dist = 0.1 * Math.sqrt((sectx - ix) * (double) (sectx - ix) +
                        (secty - iy) * (double) (secty - iy));
                switch (iQuadrant) {
                    case IHT: // Ram a Tholian
                    case IHK: // Ram enemy ship
                    case IHC:
                    case IHS:
                    case IHR:
                        sectx = ix;
                        secty = iy;
                        ram(0, iquad, sectx, secty);
                        finalx = sectx;
                        finaly = secty;
                        break;
                    case IHBLANK:
                        skip(1);
                        prouts("***RED ALERT!  RED ALERT!");
                        skip(1);
                        proutn("***");
                        crmshp();
                        proutn(" pulled into black hole at");
                        cramlc(2, ix, iy);
                        skip(1);
                        finish(FHOLE);
                        return;
                    default:
                        // something else
                        skip(1);
                        crmshp();
                        if (iquad == IHWEB)
                            proutn(" encounters Tholian web at");
                        else
                            proutn(" blocked by object at");
                        cramlc(2, ix, iy);
                        prout("; Emergency stop required ");
                        cramf(stopegy, 0, 2);
                        prout(" units of energy.");
                        energy -= stopegy;
                        finalx = x - deltax + 0.5;
                        sectx = (int) finalx;
                        finaly = y - deltay + 0.5;
                        secty = (int) finaly;
                        if (energy <= 0) {
                            finish(FNRG);
                            return;
                        }
                        break;
                }
                break; // sorry!
            }
        }
        dist = 0.1 * Math.sqrt((sectx - ix) * (double) (sectx - ix) +
                (secty - iy) * (double) (secty - iy));
        sectx = ix;
        secty = iy;
    }
    finalx = sectx; // THESE STATEMENTS DO NOTHING USEFUL
    finaly = secty;
    // No quadrant change -- compute new avg enemy distances
    quad[sectx][secty] = ship;
    if (nenhere) {
        for (l = 1; l <= nenhere; l++) {
            finald = Math.sqrt((ix - kx[l]) * (double) (ix - kx[l]) +
                    (iy - ky[l]) * (double) (iy - ky[l]));
            kavgd[l] = 0.5 * (finald + kdist[l]);
            kdist[l] = finald;
        }
        sortkl();
        if (d.galaxy[quadx][quady] != 1000 && iattak == 0)
            attack(0);
        for (l = 1; l <= nenhere; l++)
            kavgd[l] = kdist[l];
    }
    newcnd();
    iAttack = 0;
}

    public static void dock(){

    }

    public static void warp(){

    }
}
