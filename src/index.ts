import { registerPlugin } from '@capacitor/core';

import type { Base64Plugin } from './definitions';

const Base64 = registerPlugin<Base64Plugin>('Base64', {
  web: () => import('./web').then(m => new m.Base64Web()),
});

export * from './definitions';
export { Base64 };
